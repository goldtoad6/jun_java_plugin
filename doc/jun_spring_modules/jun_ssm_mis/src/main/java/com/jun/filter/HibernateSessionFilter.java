package com.jun.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jun.util.HibernateSessionUtils;

/**
 * @author Wujun
 * @createTime   Jul 28, 2011 10:50:40 PM
 */
public class HibernateSessionFilter implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Session session = null;
		try {
			chain.doFilter(request,response);
			session = HibernateSessionUtils.getCurrentSession();
			if(null != session){
				session.getTransaction().commit();
			}
		} catch (Exception e) {
			if(null != session){
				session.getTransaction().rollback();
			}
			throw new RuntimeException(e);
		} finally{
			HibernateSessionUtils.closeSession();
		}
	}

	public void init(FilterConfig config) throws ServletException {}
}

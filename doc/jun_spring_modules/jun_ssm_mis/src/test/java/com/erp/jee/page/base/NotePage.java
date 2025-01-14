package com.erp.jee.page.base;

import com.erp.page.BasePage;

import java.math.BigDecimal;
/**
 *@类:NotePage
 *@作者:zhangdaihao
 *@E-mail:zhangdaiscott@163.com
 *@日期:2013-1-18 
 */

@SuppressWarnings("serial")
public class NotePage extends BasePage implements java.io.Serializable {

	/**OBID*/
	private java.lang.String obid;

	/**标题*/
	private java.lang.String title;

	/**公告内容*/
	private java.lang.String content;

	/**create_dt*/
	private java.util.Date createDt;

	/**crtuser*/
	private java.lang.String crtuser;

	/**crtuser_name*/
	private java.lang.String crtuserName;

	/**
	 *方法: 取得obid
	 *@return: java.lang.String  obid
	 */
	public java.lang.String getObid(){
		return this.obid;
	}

	/**
	 *方法: 设置obid
	 *@param: java.lang.String  obid
	 */
	public void setObid(java.lang.String obid){
		this.obid = obid;
	}

	/**
	 *方法: 取得title
	 *@return: java.lang.String  title
	 */
	public java.lang.String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置title
	 *@param: java.lang.String  title
	 */
	public void setTitle(java.lang.String title){
		this.title = title;
	}

	/**
	 *方法: 取得content
	 *@return: java.lang.String  content
	 */
	public java.lang.String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置content
	 *@param: java.lang.String  content
	 */
	public void setContent(java.lang.String content){
		this.content = content;
	}

	/**
	 *方法: 取得createDt
	 *@return: java.util.Date  createDt
	 */
	public java.util.Date getCreateDt(){
		return this.createDt;
	}

	/**
	 *方法: 设置createDt
	 *@param: java.util.Date  createDt
	 */
	public void setCreateDt(java.util.Date createDt){
		this.createDt = createDt;
	}

	/**
	 *方法: 取得crtuser
	 *@return: java.lang.String  crtuser
	 */
	public java.lang.String getCrtuser(){
		return this.crtuser;
	}

	/**
	 *方法: 设置crtuser
	 *@param: java.lang.String  crtuser
	 */
	public void setCrtuser(java.lang.String crtuser){
		this.crtuser = crtuser;
	}

	/**
	 *方法: 取得crtuserName
	 *@return: java.lang.String  crtuserName
	 */
	public java.lang.String getCrtuserName(){
		return this.crtuserName;
	}

	/**
	 *方法: 设置crtuserName
	 *@param: java.lang.String  crtuserName
	 */
	public void setCrtuserName(java.lang.String crtuserName){
		this.crtuserName = crtuserName;
	}

}
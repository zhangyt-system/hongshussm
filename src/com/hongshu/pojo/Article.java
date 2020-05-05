package com.hongshu.pojo;

import java.util.Date;

public class Article {
	private Integer art_id;
	private String art_pic;
	private String art_title;
	private String art_content;
	private Date cust_createtime;
	private User user;
	public Integer getArt_id() {
		return art_id;
	}
	public void setArt_id(Integer art_id) {
		this.art_id = art_id;
	}
	public String getArt_pic() {
		return art_pic;
	}
	public void setArt_pic(String art_pic) {
		this.art_pic = art_pic;
	}
	public String getArt_title() {
		return art_title;
	}
	public void setArt_title(String art_title) {
		this.art_title = art_title;
	}
	public String getArt_content() {
		return art_content;
	}
	public void setArt_content(String art_content) {
		this.art_content = art_content;
	}
	public Date getCust_createtime() {
		return cust_createtime;
	}
	public void setCust_createtime(Date cust_createtime) {
		this.cust_createtime = cust_createtime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}

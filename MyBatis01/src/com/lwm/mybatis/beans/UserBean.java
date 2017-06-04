package com.lwm.mybatis.beans;

import java.io.Serializable;

/**
* @ClassName: UserBean 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date Jan 1, 2017 10:57:31 PM 
*
 */

public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private Double account;
	
	public UserBean(){
		super();
	}
	
	public UserBean(String username, String password, Double account){
		super();
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}
	
	@Override
	public String toString(){
		return "UserBean [id=" + id + ", username=" + username + ", password=" 
				+ password + ", account=" + account + "]";
	}

}

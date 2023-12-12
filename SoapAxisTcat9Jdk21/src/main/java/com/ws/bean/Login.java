package com.ws.bean;

import java.io.Serializable;

public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String user;
	private String pasword;
	private String message;
	private Boolean status;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	

}

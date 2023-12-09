package com.ws.bean;

import java.io.Serializable;

public class BeanLogin implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String usuari;
	private String pasword;
	private String missatge;
	private Boolean status;
	
	
	public String getUsuari() {
		return usuari;
	}
	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getMissatge() {
		return missatge;
	}
	public void setMissatge(String missatge) {
		this.missatge = missatge;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}

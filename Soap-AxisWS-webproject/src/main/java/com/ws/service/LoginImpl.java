package com.ws.service;

import com.ws.bean.Login;

public class LoginImpl implements IfaceLogin{

	public Login validaLogin(Login log) {
		Login login = new Login();
		
		if("jaume".equals(log.getUser())) {
			login.setMessage("LOGIN OK");
			login.setStatus(true);
		} else {
			login.setMessage("KO LOGIN");
			login.setStatus(false);
		}
		return login;
	}

	/*
	 A partir d'aqui fariem la logica amb model i l'acces a dades amb dao.
	 suposo que le controlador seria el propi ws 
	 */
	
}

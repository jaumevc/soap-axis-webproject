package com.ws.service;

import com.ws.bean.BeanLogin;

public class LoginImpl implements IfaceLogin {

	@Override
	public BeanLogin validaLogin(BeanLogin login) {
		BeanLogin log = new BeanLogin();
		if ("jaume".equals(login.getUsuari()) 
				&& "1234".equals(login.getPasword())) {

			log.setMissatge("Usuari i password correctes");
			log.setStatus(true);
		}else {
			log.setMissatge("ERROR d\'Usuari i password.");
			log.setStatus(false);
		}
		return log;
	}

	//A partir d'aqui creariam la capa de negoci (model) i de persisitencia (dao). 
	//en un projecte web classic faltaria la classe controlador previa al service, 
	//que en aquest cas suposo que serà el ws
}

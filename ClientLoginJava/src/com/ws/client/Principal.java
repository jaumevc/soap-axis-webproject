package com.ws.client;

import java.rmi.RemoteException;

import com.ws.bean.Login;
import com.ws.service.*;

public class Principal {

	public static void main(String[] args) {
		LoginImpl ilogin = new LoginImplProxy("http://localhost:8080/SoapAxisTcat9Jdk21/services/LoginImpl");

		Login log = new Login();
		
		log.setUser("Jaume");
		log.setPasword("Jaume");
		
		try {
			log = ilogin.validaLogin(log);
			
			if(log.getStatus()) {
				System.out.println("Welcome....");
			}else {
				System.out.println(log.getMessage());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}

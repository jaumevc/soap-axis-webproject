/**
 * LoginImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service;

public interface LoginImplService extends javax.xml.rpc.Service {
    public java.lang.String getLoginImplAddress();

    public com.ws.service.LoginImpl getLoginImpl() throws javax.xml.rpc.ServiceException;

    public com.ws.service.LoginImpl getLoginImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

/**
 * LoginImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service;

public class LoginImplServiceLocator extends org.apache.axis.client.Service implements com.ws.service.LoginImplService {

    public LoginImplServiceLocator() {
    }


    public LoginImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginImpl
    private java.lang.String LoginImpl_address = "http://localhost:8080/SoapAxisTcat9Jdk21/services/LoginImpl";

    public java.lang.String getLoginImplAddress() {
        return LoginImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginImplWSDDServiceName = "LoginImpl";

    public java.lang.String getLoginImplWSDDServiceName() {
        return LoginImplWSDDServiceName;
    }

    public void setLoginImplWSDDServiceName(java.lang.String name) {
        LoginImplWSDDServiceName = name;
    }

    public com.ws.service.LoginImpl getLoginImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginImpl(endpoint);
    }

    public com.ws.service.LoginImpl getLoginImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.service.LoginImplSoapBindingStub _stub = new com.ws.service.LoginImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoginImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginImplEndpointAddress(java.lang.String address) {
        LoginImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.service.LoginImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.service.LoginImplSoapBindingStub _stub = new com.ws.service.LoginImplSoapBindingStub(new java.net.URL(LoginImpl_address), this);
                _stub.setPortName(getLoginImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LoginImpl".equals(inputPortName)) {
            return getLoginImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.com", "LoginImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.com", "LoginImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginImpl".equals(portName)) {
            setLoginImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

package com.ws.service;

public class LoginImplProxy implements com.ws.service.LoginImpl {
  private String _endpoint = null;
  private com.ws.service.LoginImpl loginImpl = null;
  
  public LoginImplProxy() {
    _initLoginImplProxy();
  }
  
  public LoginImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginImplProxy();
  }
  
  private void _initLoginImplProxy() {
    try {
      loginImpl = (new com.ws.service.LoginImplServiceLocator()).getLoginImpl();
      if (loginImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginImpl != null)
      ((javax.xml.rpc.Stub)loginImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.service.LoginImpl getLoginImpl() {
    if (loginImpl == null)
      _initLoginImplProxy();
    return loginImpl;
  }
  
  public com.ws.bean.Login validaLogin(com.ws.bean.Login log) throws java.rmi.RemoteException{
    if (loginImpl == null)
      _initLoginImplProxy();
    return loginImpl.validaLogin(log);
  }
  
  
}
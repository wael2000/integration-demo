package sample.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5.redhat-00001
 * 2018-09-19T01:05:19.141+04:00
 * Generated source version: 3.2.5.redhat-00001
 *
 */
@WebService(targetNamespace = "http://service.ws.sample/", name = "Hello")
@XmlSeeAlso({ObjectFactory.class})
public interface Hello {

    @WebMethod(action = "urn:GetAccount")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.GetAccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public sample.ws.service.Account getAccount(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod(action = "urn:GetAccounts")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.GetAccountsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<sample.ws.service.Account> getAccounts();

    @WebMethod(action = "urn:SayHello")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.ws.sample/", className = "sample.ws.service.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "myname", targetNamespace = "")
        java.lang.String myname
    );
}

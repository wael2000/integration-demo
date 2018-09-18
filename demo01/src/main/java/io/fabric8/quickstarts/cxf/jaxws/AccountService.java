/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.fabric8.quickstarts.cxf.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;
import java.util.ArrayList;

@WebService(targetNamespace = "http://service.ws.sample/", name = "AccountService")
public interface AccountService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccounts",
                    targetNamespace = "http://service.ws.sample/",
                    className = "io.fabric8.quickstarts.cxf.jaxws.GetAccounts")
    @WebMethod(action = "urn:GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse",
                     targetNamespace = "http://service.ws.sample/",
                     className = "io.fabric8.quickstarts.cxf.jaxws.GetAccountsResponse")
    List<Account> getAccounts();


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccount",
                    targetNamespace = "http://service.ws.sample/",
                    className = "io.fabric8.quickstarts.cxf.jaxws.GetAccount")
    @WebMethod(action = "urn:GetAccount")
    @ResponseWrapper(localName = "getAccountResponse",
                     targetNamespace = "http://service.ws.sample/",
                     className = "io.fabric8.quickstarts.cxf.jaxws.GetAccountResponse")
    Account getAccount(@WebParam(name = "id", targetNamespace = "") String id);
}

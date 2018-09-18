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

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

@javax.jws.WebService(serviceName = "AccountService", portName = "AccountServicePort",
                    targetNamespace = "http://service.ws.sample/",
                    endpointInterface = "io.fabric8.quickstarts.cxf.jaxws.AccountService")
public class AccountServiceImpl implements AccountService {

    private static final Logger LOG = Logger.getLogger(AccountServiceImpl.class.getName());

    public List<Account> getAccounts() {
        try {
            ArrayList<Account> list = new ArrayList<Account>();
            for (int i = 1; i <= 200; i++) {
              Account account = new Account();
              account.setId(i);
              account.setFirstName("First Name_" + i);
              account.setLastName("Last Name_" + i);
              account.setEmail("Name_" + i + "@redhat.com");
              account.setCompany("red hat");
              account.setAddressLine1("AddressLine1_" + i);
              account.setAddressLine2("AddressLine2_" + i);
              account.setTotal(10000*i);
              account.setCharges(100*i);
              list.add(account);
            }
            return list;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public Account getAccount(String id){
      Account account = new Account();
      account.setId(java.lang.Integer.valueOf(id));
      account.setFirstName("First Name_" + id);
      account.setLastName("Last Name_" + id);
      account.setEmail("Name_" + id + "@redhat.com");
      account.setCompany("red hat");
      account.setAddressLine1("AddressLine1_" + id);
      account.setAddressLine2("AddressLine2_" + id);
      account.setTotal(10000*java.lang.Integer.valueOf(id));
      account.setCharges(100*java.lang.Integer.valueOf(id));
      return account;
    }

}

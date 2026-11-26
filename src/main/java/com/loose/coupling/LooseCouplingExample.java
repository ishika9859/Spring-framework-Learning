package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args){
        UserDataProvider userDataProviderWS = new WebServiceDataProvider();
        UserManager userManagerWS = new UserManager(userDataProviderWS);
        System.out.println(userManagerWS.getUserInfo());

        UserDataProvider userDataProviderDB = new UserDatabase();
        UserManager userManagerDB = new UserManager(userDataProviderDB);
        System.out.println(userManagerDB.getUserInfo());
    }
}

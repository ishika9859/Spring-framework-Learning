package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args){
        UserDataProvider userDataDB = new UserDatabase();
        UserManager userManagerDB = new UserManager(userDataDB);
        System.out.println(userManagerDB.getUserInfo());

        UserDataProvider userDataWS= new WebServiceDataProvider();
        UserManager userManagerWS = new UserManager(userDataWS);
        System.out.println(userManagerWS.getUserInfo());
    }
}

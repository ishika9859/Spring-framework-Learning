package com.ioc.coupling;

public class UserDatabase implements UserDataProvider {//it is going to get the user information from the database
    public String getUserDetails(){
        //Direct access the database
        return "User details from the database";
    }
}

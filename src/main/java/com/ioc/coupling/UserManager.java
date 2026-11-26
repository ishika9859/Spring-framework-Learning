package com.ioc.coupling;

public class UserManager {
    //responsible for managing user information
//    private UserDatabase userDatabase = new UserDatabase();

    private UserDataProvider userDataProvider;
    UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){

        return userDataProvider.getUserDetails();
    }
}

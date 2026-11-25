package com.tight.coupling;

public class UserManager {
    //responsible for managing user information
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}

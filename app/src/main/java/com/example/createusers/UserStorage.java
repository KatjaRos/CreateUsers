package com.example.createusers;

import java.util.ArrayList;

public class UserStorage {
    public ArrayList<UserInformation> users = new ArrayList<>();

    private static UserStorage storage = null;
    private UserStorage(){}

    public void addUser(UserInformation user){users.add(user);

    }
    public static UserStorage getInstance(){
        if(storage == null){
            storage = new UserStorage();
        }
        return storage;
    }
    public ArrayList<UserInformation> getUsers() {return users;}
}

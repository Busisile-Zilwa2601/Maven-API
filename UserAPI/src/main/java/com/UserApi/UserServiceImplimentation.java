package com.UserApi;

import java.util.Collection;
import java.util.HashMap;

public class UserServiceImplimentation implements UserServices{

    private HashMap<String ,User>userMap;

    public UserServiceImplimentation(){
        userMap = new HashMap<>();
    }
    public void addUser(User user){
        userMap.put(user.getID(), user);
    }
    public Collection<User> getUsers(){
        return userMap.values();
    }
    public User getUser(String id){
        return userMap.get(id);
    }
    public User editUser(User user) throws UserException{
        try{
            
            if(user.getID() == null){
                throw new UserException("ID can not be blank");
            }
            User toEdit = userMap.get(user.getID());
            if(toEdit == null){
                throw new UserException("User not found");
            }
            if(user.getEmail() != null){
                toEdit.setEmail(user.getEmail());
            }
            if(user.getFirstName()!=null){
                toEdit.setFirstName(user.getFirstName());
            }
            if(user.getLastName() != null){
                toEdit.setLastName(user.getLastName());
            }
            if(user.getID() !=null){
                toEdit.setID(user.getID());
            }
            
            return toEdit;
        }catch(Exception err){
            throw new UserException(err.getMessage());
        }
    }
    public void deleteUser(String id){
        userMap.remove(id);
    }
    public Boolean userExist(String id){
        return userMap.containsKey(id);
    }
}
package com.UserApi;
import java.util.Collection;
import org.omg.CORBA.UserException;

public interface UserServices{
    
    public void addUser(User user);
    
    public Collection<User> getUsers ();
    
    public User getUser (String id);
    
    public User editUser(User user)
        throws UserException;
    
    public void deleteUser(String id);

    public Boolean userExist(String id);
    
}
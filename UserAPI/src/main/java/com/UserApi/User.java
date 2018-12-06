package com.UserApi;

public class User{
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public User(){
        this.id = ""; 
        this.firstName  = "";
        this.lastName = "";
        this.email = "";
        
    }
    public User(String myID, String fname, String lname, String myEmail){
       this.id = myID;
       this.firstName = fname;
       this.lastName = lname;
       this.email = myEmail; 
    }
    //setter
    public void setID(String myID){
        this.id = myID;
    }
    public void setFirstName(String myFirstName){
        this.firstName = myFirstName;
    }
    public void setLastName(String myLastName){
        this.lastName = myLastName;
    }
    public void setEmail(String myEmail){
        this.email = myEmail;
    }
    //get
    public String getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
}
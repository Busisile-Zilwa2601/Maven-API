package com.UserApi;

public enum StatusResponse{
    SUCCESS ("Success"),ERROR ("Error");

    final private String status;
    
    StatusResponse(String status){
        this.status = status;
    }
    public String getSatus(){
        return status;
    } 
}
package com.UserApi;

import com.google.gson.JsonElement;

public class StandardResponse{
    private StatusResponse status;
    private String message;
    private JsonElement data;

    public StandardResponse(StatusResponse status){
        this.status = status;
    }
    public StandardResponse(StatusResponse status, String message){
        this.status = status;
        this.message = message;
    }
    public StandardResponse(StatusResponse status, JsonElement data){
        this.status = status;
        this.data = data;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public StatusResponse getStatus(){
        return status;
    }
    public void setStatus(StatusResponse status){
        this.status = status;
    }
    public JsonElement getJsonData(){
        return data;
    }
    public void setJsonData(JsonElement data){
        this.data = data;
    } 
}
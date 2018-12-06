package com.UserApi;

import static spark.Spark.*;
import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        final UserServices userServices = new UserServiceImplimentation();

        get("/users", (req, res)->{
            res.type("application/json");
            return new Gson()
            .toJson(new StandadResponse(StatusReponse.SUCCESS, new Gson()
            .toJsonTree(userServices)));
        });
        get("/users/:id", (req, res)->{
            res.type("application/json");
        });
        post("/users", (req, res)->{
            res.type("application/json");
            User user = new Gson().fromJson(req.body(), User.class);
            userServices.addUser(user);

            return new Gson()
                .toJson(new StandardResponse(StatusResponse.SUCCESS));
        });
        put("/users/:id", (req, res)->{
            res.type("application/json");
            User user = new Gson().fromJson(req.body(), User.class);
            User editedUser = UserServices.editUser(toEdit);
            if(editedUser != null){
                return new Gson()
                .toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson()
                .toJsonTree(editedUser)));
            }else{
                return new Gson()
                .toJson(new StandardResponse(StatusResponse.ERROR,new Gson()
                .toJson("User not found or error editing")));
            }
        });
        options("/users/:id", (req, res)->{

        });
        delete("/users/:id", (req, res)->{

        });   
    }
}

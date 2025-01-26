package com.arindam.lld_soliddesignpattern.SOLID.LSP;

public class BasicAuth implements IAuthentication {

/*
    //LSP violation , as we are throwing a runtime exception
    @Override
    public String login(String username, String password) {
        //logic to check in the db , if the user is valid
        // ,,,
        //if user not valid
        throw new RuntimeException("User not valid");
    }
*/

    //LSP follows
     @Override
     public String login(String username, String password) {
        //logic to check in the db , if the user is valid
        // ,,,
        //if user not valid
        return "User not valid";
     }



}

package com.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckout {
    public void filterLogin(String login, String password){
        Pattern p = Pattern.compile("[\0n]");
        Matcher m = p.matcher(login);
        Pattern pp = Pattern.compile("[^a-zA-z0-9]");
        Matcher mm = pp.matcher(password);

        if(m.find()) {
            System.err.println("Login can't be longer than 7 characters");
        }

        if(mm.find()){
            System.err.println("Password can't contain any characters than letter or numbers ");
        }


    }
}

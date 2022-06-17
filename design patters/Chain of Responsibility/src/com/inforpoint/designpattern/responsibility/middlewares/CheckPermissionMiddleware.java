package com.inforpoint.designpattern.responsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if(email.equals("alexvieira.360@hotmail.com")){
            System.out.println("Seja bem vindo administrador!");
            return true;
        }

        System.out.println("Bem vindo");
        return checkNext(email, password);
    }
}

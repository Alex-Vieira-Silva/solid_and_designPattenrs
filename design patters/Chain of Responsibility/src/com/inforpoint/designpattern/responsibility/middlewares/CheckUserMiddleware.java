package com.inforpoint.designpattern.responsibility.middlewares;

import com.inforpoint.designpattern.responsibility.server.Server;

public class CheckUserMiddleware extends Middleware{
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hashEmail(email)){
            System.out.println("E-mail inválido");
            return false;
        }else if(!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha são inválidos!");
            return false;
        }

        return checkNext(email, password);
    }
}

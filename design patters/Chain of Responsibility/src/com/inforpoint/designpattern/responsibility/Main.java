package com.inforpoint.designpattern.responsibility;

import com.inforpoint.designpattern.responsibility.middlewares.CheckPermissionMiddleware;
import com.inforpoint.designpattern.responsibility.middlewares.CheckUserMiddleware;
import com.inforpoint.designpattern.responsibility.middlewares.Middleware;
import com.inforpoint.designpattern.responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        Server server = new Server();
        server.registerUsers("alexvieira.360@hotmail.com", "avg384896");
        server.registerUsers("user@hotmail.com", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());
        server.setMiddleware(middleware);

    }
    public static void main(String[] args) throws IOException {
	// write your code here
        init();
        boolean done;

        do{
            System.out.println("Digite o email!");
            String email = reader.readLine();
            System.out.println("Digite sua senha!");
            String password = reader.readLine();
            done = server.login(email, password);
        }while (!done);
    }
}

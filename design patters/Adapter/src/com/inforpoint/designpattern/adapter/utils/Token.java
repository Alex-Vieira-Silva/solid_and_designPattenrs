package com.inforpoint.designpattern.adapter.utils;

public class Token {
    private String token;

    public Token(){
        this.token = "https://jwt.io/#debugger-io?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbiBQYXR0ZXJucyIsImlhdCI6MTUxNjIzOTAyMn0.UiiAMoY7bSAZAt78F88exJK1_Msf1aPlLWwuj-W7-rk";
    }

    public String getToken(){
        return token;
    }
}

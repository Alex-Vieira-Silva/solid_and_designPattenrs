package com.inforpoint.designpattern.adapter.payoneer;

import com.inforpoint.designpattern.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayoneer() {
        this.token = authToken();
        System.out.println("Enviando pagamenotos via Payoneer!");
    }

    @Override
    public void receivePayoneer() {
        System.out.println("Recebendo pagamentos via Payoneer!");
    }
}

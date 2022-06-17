package com.inforpoint.designpattern.adapter.paypal;

import com.inforpoint.designpattern.adapter.utils.Token;

public class Paypal implements IPayPalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via Paypal!");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Receendo pagamentos via Paypal!");
    }
}

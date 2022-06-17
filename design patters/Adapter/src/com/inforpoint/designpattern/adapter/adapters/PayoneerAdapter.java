package com.inforpoint.designpattern.adapter.adapters;

import com.inforpoint.designpattern.adapter.payoneer.Payoneer;
import com.inforpoint.designpattern.adapter.paypal.IPayPalPayments;
import com.inforpoint.designpattern.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do Paypal!");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        this.payoneer.sendPayoneer();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayoneer();
    }
}

package com.inforpoint.designpattern.adapter.adapters;

import com.inforpoint.designpattern.adapter.mercadopago.MercadoPago;
import com.inforpoint.designpattern.adapter.paypal.IPayPalPayments;
import com.inforpoint.designpattern.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago utilizando os métodos do Paypal!");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.mercadoPagoPayment();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.mercadoPagoReceive();
    }
}

package com.inforpoint.designpattern.adapter.mercadopago;

import com.inforpoint.designpattern.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPagoPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via Mercado Pago!");
    }

    @Override
    public void mercadoPagoReceive() {
        System.out.println("Recebendo pagamentos via Mercado Pago!");
    }
}

package com.inforpoint.designpattern.adapter.mercadopago;

import com.inforpoint.designpattern.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();
    void mercadoPagoPayment();
    void mercadoPagoReceive();
}

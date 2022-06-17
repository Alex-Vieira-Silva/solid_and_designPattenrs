package com.inforpoint.designpattern.adapter.paypal;

import com.inforpoint.designpattern.adapter.utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}

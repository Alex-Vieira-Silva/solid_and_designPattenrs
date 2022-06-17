package com.inforpoint.designpattern.adapter;

import com.inforpoint.designpattern.adapter.adapters.MercadoPagoAdapter;
import com.inforpoint.designpattern.adapter.adapters.PayoneerAdapter;
import com.inforpoint.designpattern.adapter.mercadopago.MercadoPago;
import com.inforpoint.designpattern.adapter.payoneer.Payoneer;
import com.inforpoint.designpattern.adapter.paypal.IPayPalPayments;
import com.inforpoint.designpattern.adapter.paypal.Paypal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());
        payment.paypalPayment();
        payment.paypalReceive();
    }
}

package com.inforpoint.solid.dip;

import com.inforpoint.solid.dip.payment.Payment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Payment payment = new Payment();
        payment.pay("250");
    }
}

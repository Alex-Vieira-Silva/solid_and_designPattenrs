package com.inforpoint.designpattern.adapter.payoneer;

import com.inforpoint.designpattern.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayoneer();
    void receivePayoneer();
}

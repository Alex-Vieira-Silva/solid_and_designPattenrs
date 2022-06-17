package com.inforpoint.solid.lsp;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}

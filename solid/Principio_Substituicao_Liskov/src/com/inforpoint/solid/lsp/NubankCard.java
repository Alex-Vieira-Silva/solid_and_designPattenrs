package com.inforpoint.solid.lsp;

public class NubankCard implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validação basica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado!");
    }
}

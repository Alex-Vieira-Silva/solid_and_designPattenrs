package com.inforpoint.solid.lsp;

public class NubankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        System.out.println("Limite ok, Rewards ok!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pagamento debitado no programa Rewards!");
    }
}

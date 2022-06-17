package com.inforpoint.solid.lsp;

public class CreditCard extends NubankCard{
    @Override
    public void validate() throws Exception {
        System.out.println("Validando o limite!");
        System.out.println("Ok!");
    }
}

package com.inforpoint.solid.dip.model;

public class MySqlProduct implements IDbProduct{
    @Override
    public String getProductById(String productID) {
        return "Mysql: Exibindo dados do produto " + productID;
    }
}

package com.inforpoint.solid.dip.model;

public class MongoDbProduct implements IDbProduct{
    @Override
    public String getProductById(String productID) {
        return "MongoDb: Exibindo dados do produto " + productID;
    }
}

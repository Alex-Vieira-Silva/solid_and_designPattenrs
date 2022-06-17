package com.inforpoint.solid.dip.payment;

import com.inforpoint.solid.dip.factory.DbProductFactory;
import com.inforpoint.solid.dip.model.Db;
import com.inforpoint.solid.dip.model.IDbProduct;

public class Payment {
    public void pay(String productID){
        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}

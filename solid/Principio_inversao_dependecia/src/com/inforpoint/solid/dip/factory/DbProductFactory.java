package com.inforpoint.solid.dip.factory;

import com.inforpoint.solid.dip.model.Db;
import com.inforpoint.solid.dip.model.IDbProduct;
import com.inforpoint.solid.dip.model.MongoDbProduct;
import com.inforpoint.solid.dip.model.MySqlProduct;

public class DbProductFactory {
    public static IDbProduct create(Db typer){
        if(typer == Db.MYSQL){
            return new MySqlProduct();
        }else {
            return new MongoDbProduct();
        }
    }
}

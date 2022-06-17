package com.inforpoint.designpattern.builder.builders;

import com.inforpoint.designpattern.builder.components.CarType;
import com.inforpoint.designpattern.builder.components.Engine;
import com.inforpoint.designpattern.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setColor(String color);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}

package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product.Transport;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product.Truck;

public class RoadLogistic implements Logistics {

    @Override
    public void planDelivery() {
        System.out.println("Plan Road Delivery");
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

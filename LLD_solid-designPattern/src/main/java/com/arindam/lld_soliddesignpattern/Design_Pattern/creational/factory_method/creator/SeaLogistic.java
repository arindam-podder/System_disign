package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product.Ship;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product.Transport;

public class SeaLogistic implements Logistics {

    @Override
    public void planDelivery() {
        System.out.println("Plan Delivery by Sea");
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

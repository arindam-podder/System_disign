package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product.Transport;

public interface Logistics {
    void planDelivery();
    Transport createTransport();            //factory method , subclasses will be the creator
}

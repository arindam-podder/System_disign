package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator.Logistics;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator.RoadLogistic;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.creator.SeaLogistic;

public class Test {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistic();
        roadLogistics.planDelivery();
        roadLogistics.createTransport().deliver();

        Logistics seaLogistics = new SeaLogistic();
        seaLogistics.planDelivery();
        seaLogistics.createTransport().deliver();
    }
}

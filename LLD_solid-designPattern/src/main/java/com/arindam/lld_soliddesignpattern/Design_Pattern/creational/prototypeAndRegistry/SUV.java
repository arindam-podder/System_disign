package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.prototypeAndRegistry;

public class SUV implements Vehicle<SUV>{
    private String type = "SUV";
    private int horsepower = 250;
    private String fuel = "Petrol";

    @Override
    public void showDetails() {
        System.out.println("Type: "+type);
        System.out.println("Horsepower: "+horsepower);
        System.out.println("Fuel: "+fuel);
    }

    //here we are implementing the copy method of the Prototype interface
    @Override
    public SUV copy() {
        SUV obj = new SUV();
        obj.type = this.type;
        obj.horsepower = this.horsepower;
        obj.fuel = this.fuel;
        return obj;
    }
}

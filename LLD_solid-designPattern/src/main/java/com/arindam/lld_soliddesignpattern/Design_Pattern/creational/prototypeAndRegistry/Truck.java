package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.prototypeAndRegistry;

public class Truck implements Vehicle<Truck>{
    private String type = "Truck";
    private int horsepower = 400;
    private String fuel = "Diesel";


    @Override
    public void showDetails() {
        System.out.println("Type: "+type);
        System.out.println("Horsepower: "+horsepower);
        System.out.println("Fuel: "+fuel);
    }

    @Override
    public Truck copy() {
        Truck truck = new Truck();
        truck.type = this.type;
        truck.horsepower = this.horsepower;
        truck.fuel = this.fuel;
        return truck;
    }
}

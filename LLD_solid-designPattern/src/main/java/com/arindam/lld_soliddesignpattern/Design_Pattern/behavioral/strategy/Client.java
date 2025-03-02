package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy;

public class Client {
    public static void main(String[] args) {

        GoogleMap map = new GoogleMap();
        map.findPath("A", "B", "bike");

    }
}

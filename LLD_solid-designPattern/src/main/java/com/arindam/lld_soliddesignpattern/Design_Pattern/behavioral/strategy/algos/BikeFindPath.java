package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos;

public class BikeFindPath implements FindPathStrategy {

    @Override
    public void findPath(String a, String b) {
        System.out.println("here is bike path from " + a + " to " + b);
    }
}

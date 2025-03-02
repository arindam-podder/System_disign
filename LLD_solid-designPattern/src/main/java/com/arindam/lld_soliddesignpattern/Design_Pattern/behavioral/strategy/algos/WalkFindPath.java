package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos;

public class WalkFindPath implements FindPathStrategy {

    @Override
    public void findPath(String a, String b) {
        System.out.println("here is walking path from " + a + " to " + b);
    }


}

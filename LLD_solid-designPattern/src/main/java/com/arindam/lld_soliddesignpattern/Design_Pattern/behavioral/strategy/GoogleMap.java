package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy;

import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos.FindPathStrategy;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.factory.FindPathStrategyFactory;

public class GoogleMap {

    void findPath(String a, String b, String mode) {
        FindPathStrategy findPathStrategy = FindPathStrategyFactory.getStrategy(mode);
        if(findPathStrategy == null) {
            System.out.println("Invalid mode");
            return;
        }
        else findPathStrategy.findPath(a, b);
    }

}

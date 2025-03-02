package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.factory;

import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos.BikeFindPath;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos.FindPathStrategy;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.strategy.algos.WalkFindPath;

public class FindPathStrategyFactory {

    public static FindPathStrategy getStrategy(String mode) {
        if (mode.equals("walk")) {
            return new WalkFindPath();
        } else if (mode.equals("bike")) {
            return new BikeFindPath();
        }
        return null;
    }
}

package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//this is the version 3 of singleton design pattern
//used double locking mechanism to reduce the overhead of locking, and suitable for performance critical applications
public class V3 {

    private static Lock lock = new ReentrantLock();
    private static V3 INSTANCE;

    private V3() {
    }

    public static V3 getInstance(){
        if(INSTANCE == null) {
            lock.lock();
            if (INSTANCE == null) {
                INSTANCE = new V3();
            }
            lock.unlock();
        }
        return INSTANCE;
    }

}

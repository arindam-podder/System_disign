package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//this is the version 2 of singleton design pattern
//best for multi-threaded environment, not for performance critical applications
public class V2 {
    private static Lock lock = new ReentrantLock();
    private static V2 INSTANCE;

    private V2() {
    }

    public static V2 getInstance(){
        lock.lock();
        if(INSTANCE==null){
            INSTANCE =  new V2();
        }
        lock.unlock();
        return INSTANCE;
    }

}

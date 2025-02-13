package com.arindam.lld_soliddesignpattern.SOLID.OCP;

public interface TestDel {

    public abstract void test();

    void test1();           //by default public abstract


    public default void test2(){
        System.out.println("hi");
    }

}

abstract class H implements TestDel{

    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void test1() {
        System.out.println("test1");
    }


    public static void main(String[] args) {
        H h = new H();
        h.test();
        h.test1();
        h.test2();
    }
}
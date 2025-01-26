package com.arindam.lld_soliddesignpattern.SOLID.OCP;

public class PaytmPayment implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PAYTM payment of amount: " + amount);
    }
}

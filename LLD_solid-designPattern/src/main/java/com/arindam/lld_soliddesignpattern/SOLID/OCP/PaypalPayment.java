package com.arindam.lld_soliddesignpattern.SOLID.OCP;

public class PaypalPayment implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of amount: " + amount);
    }
}

package com.arindam.lld_soliddesignpattern.SOLID.OCP;

public class RazorpayPayment implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment of amount: " + amount);
    }
}

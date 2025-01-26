package com.arindam.lld_soliddesignpattern.SOLID.OCP;

public class PaymentService {


    // OCP violation
    public static void processPayment(String paymentType, double amount) {
        if (paymentType.equals("Razoprpay")) {
            System.out.println("Processing Razorpay payment of amount: " + amount);
        } else if (paymentType.equals("PAYTM")) {
            System.out.println("Processing PAYTM payment of amount: " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    // OCP follows
    public static void processPayment(IPaymentProcessor paymentProcessor, double amount) {
        paymentProcessor.processPayment(amount);
    }


}

package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

public interface ArikoBankAPIAdapter {

    void processPayment(String cardNumber, String cvv, String amount);

    void currentBalance(String cardNumber, String cvv);
}

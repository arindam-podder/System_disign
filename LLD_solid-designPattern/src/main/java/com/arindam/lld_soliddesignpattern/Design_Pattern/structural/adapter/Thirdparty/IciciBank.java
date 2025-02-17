package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty;

public class IciciBank {

    public void doPayment(String cardNumber, String cvv, String amount) {
        System.out.println("Payment done with card number: " + cardNumber + " and cvv: " + cvv + " for amount: " + amount);
    }

    public void showBalance(String cardNumber, String cvv) {
        System.out.println("Balance checked for card number: " + cardNumber + " and cvv: " + cvv);
    }

}

package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty;

public class YesBank {

    public void doTransaction(String cardNumber, String cvv, String amount) {
        System.out.println("Transaction done with card number: " + cardNumber + " and cvv: " + cvv + " for amount: " + amount);
    }

    public void checkBalance(String cardNumber, String cvv) {
        System.out.println("Balance checked for card number: " + cardNumber + " and cvv: " + cvv);
    }

}

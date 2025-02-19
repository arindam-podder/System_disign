package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

public class ArikoPe {

    private ArikoBankAPIAdapter arikoBankAPI;

    public ArikoPe(ArikoBankAPIAdapter arikoBankAPI) {
        this.arikoBankAPI = arikoBankAPI;
    }


    public void pay(String cardNumber, String cvv, String amount) {
        arikoBankAPI.processPayment(cardNumber, cvv, amount);
    }

    public void balance(String cardNumber, String cvv) {
        arikoBankAPI.currentBalance(cardNumber, cvv);
    }

}

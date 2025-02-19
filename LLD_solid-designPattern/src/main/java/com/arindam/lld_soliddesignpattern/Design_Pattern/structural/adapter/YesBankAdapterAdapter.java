package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty.YesBank;

public class YesBankAdapterAdapter implements ArikoBankAPIAdapter {

    private YesBank yesBank;

    public YesBankAdapterAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }


    @Override
    public void processPayment(String cardNumber, String cvv, String amount) {
        System.out.println("Processing payment through Yes Bank");
        this.yesBank.doTransaction(cardNumber, cvv, amount);
    }

    @Override
    public void currentBalance(String cardNumber, String cvv) {
        System.out.println("Checking balance through Yes Bank");
        this.yesBank.checkBalance(cardNumber, cvv);
    }
}

package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty.IciciBank;

public class IciciBankAdapter implements ArikoBankAPIAdapter {

    private IciciBank iciciBank;

    public IciciBankAdapter(IciciBank iciciBank) {
        this.iciciBank = iciciBank;
    }

    @Override
    public void processPayment(String cardNumber, String cvv, String amount) {
        System.out.println("Processing payment through ICICI Bank");
        iciciBank.doPayment(cardNumber, cvv, amount);
    }

    @Override
    public void currentBalance(String cardNumber, String cvv) {
        System.out.println("Checking balance through ICICI Bank");
        iciciBank.showBalance(cardNumber, cvv);
    }
}

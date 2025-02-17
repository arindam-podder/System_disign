package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

public interface MyBankAPI {
    void moneyTransfer(String account1, String account2, int amount);
    void getBalance(String account);
}

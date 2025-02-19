package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty.IciciBank;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.adapter.Thirdparty.YesBank;

public class Client {

    public static void main(String[] args) {
        IciciBankAdapter iciciBankAdapter = new IciciBankAdapter(new IciciBank());
        YesBankAdapterAdapter yesBankAdapterAdapter = new YesBankAdapterAdapter(new YesBank());

        ArikoPe arikoPe1 = new ArikoPe(iciciBankAdapter);
        arikoPe1.pay("123456789", "123", "1000");
        arikoPe1.balance("123456789", "123");


        ArikoPe arikoPe2 = new ArikoPe(yesBankAdapterAdapter);
        arikoPe2.pay("123456789", "123", "1000");
        arikoPe2.balance("123456789", "123");

    }

}

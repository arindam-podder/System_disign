package com.arindam.lld_soliddesignpattern.SOLID.ISP;

public class TableToCsv implements ICsvReport {

    @Override
    public void generateCSVReport() {
        System.out.println("CSV Report generated from Table");
    }
}

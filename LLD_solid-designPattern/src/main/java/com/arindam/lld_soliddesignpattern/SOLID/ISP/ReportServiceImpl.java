package com.arindam.lld_soliddesignpattern.SOLID.ISP;

public class ReportServiceImpl implements IReportService {
    @Override
    public void generatePDFReport() {
        System.out.println("PDF Report generated");
    }
    @Override
    public void generateCSVReport() {
        System.out.println("CSV Report generated");
    }
    @Override
    public void generateExcelReport() {
        System.out.println("Excel Report generated");
    }
}

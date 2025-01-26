package com.arindam.lld_soliddesignpattern.SOLID.ISP;


// Interface Segregation Principle violation
public interface IReportService {
    void generatePDFReport();
    void generateCSVReport();
    void generateExcelReport();
}
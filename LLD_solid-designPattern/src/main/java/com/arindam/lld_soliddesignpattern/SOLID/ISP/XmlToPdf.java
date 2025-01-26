package com.arindam.lld_soliddesignpattern.SOLID.ISP;

public class XmlToPdf implements IPdfReport {

    @Override
    public void generatePDFReport() {
        System.out.println("PDF Report generated from XML");
    }
}

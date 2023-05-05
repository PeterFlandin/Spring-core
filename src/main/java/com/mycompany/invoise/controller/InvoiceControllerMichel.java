package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;


public class InvoiceControllerMichel implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice() {


        String consumerName =  "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(consumerName);

        invoiceService.createInvoice(invoice);


    }

}

package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRipository {

private static List<Invoice> invoices = new ArrayList<>();



    public void create (Invoice invoice){

invoices.add(invoice);
        System.out.println("invoices added " + invoice.getNumber()+ " pour" +invoice.getCustomerName());


    }


}

package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dans quel configuration etes vous ?");
        int configuration = sc.nextInt();
        if(configuration == 1) {
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoiceUsingConnsole();

        } else if(configuration == 2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoiceUsingWebForm();
        }
    }





}

package week03.invoice;

import java.util.Scanner;
// import week03.invoice.Invoice;

public class task15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices will you enter? ");
        int totalInvoices = input.nextInt();
        input.nextLine(); 

        Invoice[] invoiceList = new Invoice[totalInvoices];

        for (int i = 0; i < totalInvoices; i++) {
            System.out.println("\nInvoice " + (i + 1) + ":");

            System.out.print("Part number: ");
            String partNo = input.nextLine();

            System.out.print("Description: ");
            String description = input.nextLine();

            System.out.print("Quantity: ");
            int qty = input.nextInt();

            System.out.print("Price per item: ");
            double price = input.nextDouble();
            input.nextLine(); 

            invoiceList[i] = new Invoice(partNo, description, qty, price);
        }

        System.out.println("\n--- All Invoices ---");
        for (Invoice invoice : invoiceList) {
            double total = invoice.getQuantity() * invoice.getPricePerItem();
            System.out.println(invoice.getPartDescription() + 
                               " | Qty: " + invoice.getQuantity() + 
                               " | Price: $" + invoice.getPricePerItem() + 
                               " | Total: $" + total);
        }

        input.close();
    }
}
package com.sunbeam.tester;
import com.sunbeam.invoice.Invoice;
public class InvoiceTester {

	public static void main(String[] args) {
		Invoice i1=new Invoice("1001","Engine",5000,1000);
		System.out.println("Part Number"+ i1.getPartNumber());
		System.out.println("partDescription"+i1.getPartDescription());
		System.out.println("Quantity"+i1.getQuantity());
		System.out.println("Price"+i1.getPrice());
		System.out.println("Total bill-"+i1.getcalculateAmount());
		
		
		

	}

}

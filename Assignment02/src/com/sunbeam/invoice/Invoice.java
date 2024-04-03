package com.sunbeam.invoice;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	
	public Invoice() {
		
	}


	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if(price<0)
		{price=0;}
		else
		{
		this.price = price;
		}
		}
	
	public void setQty(int qty)
	{
		if(qty<0)
		{
			qty=0;
		}
		this.quantity=qty;
	}
	
	public double getcalculateAmount()
	{
		return quantity*price;
	}
	
	
	

}

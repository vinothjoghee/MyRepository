package com.k2js.BasicPractice.cooldrinks;

abstract class CoolDrinks {
	
	String brand;
	String color;
	int price;
	String taste;
	
	public CoolDrinks(String color,String taste,int price)
	{
		this.color=color;
		this.taste=taste;
		this.price=price;
	}
	
	CoolDrinks(String color,String taste,int price,String brand)
	{
		this(color,taste,price);
		this.brand=taste;
		
	}
	
	public String toString()
	{
		return "brand="+this.brand+"color="+this.color+"price="+this.price+"taste="+this.taste;
	}
	

}

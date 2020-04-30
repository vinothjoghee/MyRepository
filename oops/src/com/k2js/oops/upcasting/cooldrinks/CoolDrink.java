package com.k2js.oops.upcasting.cooldrinks;

abstract class CoolDrink {
	String brand;
	String color;
	int price;
	String taste;
	
	CoolDrink(String color,int price,String taste){
		this.color=color;
		this.price=price;
		this.taste=taste;
	}
	
	CoolDrink(String brand,String color,int price,String taste){
		this(color,price,taste);
		this.brand=brand;
	}
	
	public String toString() {
		return "brand= "+this.brand+" "
				+ "color="+this.color+" "
				+ " price= "+this.price+""
				+ " taste="+this.taste;
	}
	
	

}

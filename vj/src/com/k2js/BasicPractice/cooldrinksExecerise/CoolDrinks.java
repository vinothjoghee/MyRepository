package com.k2js.BasicPractice.cooldrinksExecerise;

public abstract class CoolDrinks {
	
	String brandname;
	int price;
	String color;
	String taste;
	
	 CoolDrinks(int price,String color,String taste){
		this.price=price;
		this.color=color;
		this.taste=taste;
		
	}
	CoolDrinks(int price,String color,String taste,String brandname){
		this(price,color,taste);
		this.brandname=brandname;
	}

	public String toString() {
		return "brandname= "+this.brandname+"\t"+
	            "color= "+this.color+"\t"+
				"taste= "+this.taste+"\t"+
	            "price= "+this.price;
	}
}

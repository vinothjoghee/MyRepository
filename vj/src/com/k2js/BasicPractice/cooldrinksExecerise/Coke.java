package com.k2js.BasicPractice.cooldrinksExecerise;

public class Coke extends CoolDrinks {
	
	
	
	private Coke(int price){
		super(price,"Brown","Sweet");
	}
	
	Coke(int price,String brandname){
	
		this(price);
		super.brandname=brandname;
	}

}

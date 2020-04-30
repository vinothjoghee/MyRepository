package com.k2js.BasicPractice.cooldrinksExecerise;

public class Fanta extends CoolDrinks {

	
	
	private Fanta(int price) {
		super(price,"Orange","SugarySweet");
	}
	
    Fanta(int price,String brandname){
	this(9);
	super.brandname=brandname;
}

}

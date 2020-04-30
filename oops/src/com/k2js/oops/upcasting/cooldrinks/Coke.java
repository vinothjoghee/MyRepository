package com.k2js.oops.upcasting.cooldrinks;

public class Coke extends CoolDrink {
	
	//you need to add below explicitily- Implicit super constructor CoolDrink() is undefined for default constructor.
	//Must define an explicit constructor

/*	Coke(String brandname,int price){
		super(brandname,"Brown",price,"sweet");
	}*/
	
	private Coke(int price) {
		super("Brown",price,"Sweet");
	}
	
	public Coke(int price,String brandname) {
		this(price);
		super.brand=brandname;
	}

	
}

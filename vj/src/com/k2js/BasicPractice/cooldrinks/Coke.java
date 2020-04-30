package com.k2js.BasicPractice.cooldrinks;

public class Coke extends CoolDrinks{

	private Coke(int price) {
		super("Black", "sweet", 10);
		// TODO Auto-generated constructor stub
	}
	
	public Coke(int price,String brand)
	{
		this(price);
		this.brand=brand;
	}

}

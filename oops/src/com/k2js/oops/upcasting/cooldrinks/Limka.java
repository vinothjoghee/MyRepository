package com.k2js.oops.upcasting.cooldrinks;

public class Limka extends CoolDrink {
Limka(String brandname,String color,String taste,int price){
	super(color,price,taste);
	super.brand=brandname;
}
}

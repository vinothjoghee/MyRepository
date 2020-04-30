package com.k2js.BasicPractice.cooldrinksExecerise;

public class CoolDrinkShop {
	
	
	
 public void getdrinks(String drinkname) {
	 CoolDrinks cd=null;
	 if(drinkname.equalsIgnoreCase("Coke")) {
		 System.out.println(cd=new Coke(10,drinkname));
	 }
		 else if(drinkname.equalsIgnoreCase("Fanta")) {
		System.out.println(cd= new Fanta(9,drinkname));
		 
		 }
		 if(cd!=null) {
			 System.out.println(drinkname+" is available");
		 }else {
			 System.out.println(drinkname+" is not available");
		 }
		 
	 
 }

}

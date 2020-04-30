package com.k2js.BasicPractice.cooldrinks;



public class CoolDrinkShop {
	
	static void getjuice(String drinkname) {
	CoolDrinks cd=null;
	 if (drinkname.equalsIgnoreCase("Coke"))
	 {
		 cd=new Coke(10,"Coke");
	 }
	 
	 if(cd!=null) {
			System.out.println(cd+"is ready");
		}else {
			System.out.println("CoolDrink is not available");
		}
	}
	
	

}

package com.k2js.oops.upcasting.cooldrinks;

public class VinothCoolDrinkShop {
	
	static void getJuice(String drinkname) {
		CoolDrink cd=null;
		
		if(drinkname.equalsIgnoreCase("coke")) {
			//Coke cd=new Coke(10,"drinkname");
			cd=new Coke(10,drinkname);
		//System.out.println(cd+"is Ready");
		}
		else if(drinkname.equalsIgnoreCase("Limka"))
		{
			//Limka l=new Limka(drinkname,"white","Seetlemon",15);
			//System.out.println(l);
			cd=new Limka(drinkname,"white","Seetlemon",15);
		}
		
		if(cd!=null) {
			System.out.println(cd+"is ready");
		}else {
			System.out.println("CoolDrink is not available");
		}
	}

}

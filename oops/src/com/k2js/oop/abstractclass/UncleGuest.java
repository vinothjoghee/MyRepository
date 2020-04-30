package com.k2js.oop.abstractclass;

public class UncleGuest {
	
	public static void main(String[] args) {
	/*scenario 1	
		//SonCarrotSweet scs=new SonCarrotSweet();//it will display all the methods Parent and Child
		//MomCarrotSweet mcs=new SonCarrotSweet();//it will display only Parent class method(upcasting)
		//((SonCarrotSweet)scs).addDryFruit();//now child method will also get displayed along with Parent method(downcasting)
		
		SonCarrotSweet scs=new SonCarrotSweet() {
	//we created temp class which doesnt have class.It always follow parent class constructor		
			public void addGarnish() {//here we are overriding the Parent class method and also can extend the scope of the method.i.e public
				System.out.println("Add Ghee");
			}
			
		};//anoymous class is subclass without a name
		scs.addDryFruit();
		scs.addSugar();
		scs.addGarnish();
		scs.buyCarrots();
*/
		//Scenario 2  
		
		
		CarrotSweet cs=new SonCarrotSweet();
		
		cs.addSugar();
		cs.boilMilk();
		cs.buyCarrots();
		cs.mixGratedSugar();
		
		
		
		
	}

}

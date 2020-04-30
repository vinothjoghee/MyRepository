package com.k2js.oop.abstractclass;

public class Uncle2Guest {
	public static void main(String[] args) {
		
		// we can call using any of the below object creation.
		SonCarrotSweet cs1=new SonCarrotSweet();
		AuntCarrotSweet cs2=new AuntCarrotSweet();
		
		
		//cs2.switchOnStove();
		//cs2.grateCarrots();
		eatCarrotSweet(cs1);
		eatCarrotSweet(cs2);
		
		
	}
	static void eatCarrotSweet(CarrotSweet cs) {
		cs.addSugar();
		cs.boilMilk();
		cs.buyCarrots();
		
	}
	
	static void findFlavour(CarrotSweet cs) {
		if(cs instanceof AuntCarrotSweet)
			((AuntCarrotSweet)cs).flavour();
		else if(cs instanceof MomCarrotSweet)
			((MomCarrotSweet)cs).addGarnish();
	}

}

package com.k2js.BasicPractice;

abstract class BankInterest {
	
	BankInterest()
	{
		System.out.println("Interest of Banks");
	}
	abstract int getinterest();
	
	void discount()
	{
		System.out.println("No Discount");
	}

}



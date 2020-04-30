package com.k2js.BasicPractice;

public class InterestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInterest b=new SBIinterest();
		System.out.println("SBI interest is" +b.getinterest()+"%");
	    b.discount();
		BankInterest h=new HDFCInterest();
		System.out.println("HDFC interest is" +h.getinterest()+"%");
		
 	}

}

package com.k2js.interviewprocess.lambdas;

public class CalcDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c1=()->{
			System.out.println(10+20);
		};
		Calc c2=()->{
			System.out.println(10*20);	
		};
		c1.calculation();
		c2.calculation();
	}

}

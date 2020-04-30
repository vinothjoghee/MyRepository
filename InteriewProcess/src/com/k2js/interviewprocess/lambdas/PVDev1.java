package com.k2js.interviewprocess.lambdas;

public class PVDev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using lambda .
		PVDev1.PPC((int x, int y)->{
			return x+y;	}, 50,20);
		
		
		}
	static void PPC(PC p1,int a,int b) {
		System.out.println(p1.performCalc(a,b));
		
	}

}

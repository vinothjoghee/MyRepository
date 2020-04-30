package com.vjs.StringExamples;

public class Fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13,21
		int fibupto=10;
		int a=0;
		int b=1;
		System.out.print(a+","+b);
		int n=0;
		for(int i=1;i<fibupto;i++) {
			n=a+b;
			System.out.print(","+n);
			a=b;
			b=n;
			
			
		}
	}

}

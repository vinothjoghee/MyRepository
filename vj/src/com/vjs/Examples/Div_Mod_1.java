package com.vjs.Examples;

public class Div_Mod_1 {

	public static void main(String[] args) {
		// Find out the big number from two digit and find the big digit of that digit.
		
		int a=69;
		int b=89;
		
		int temp=0;
		System.out.println("The biggest number between " +a+" and " +b+" is :");
		if(a>b)
		{
			temp=a;
			System.out.println(a);
		}else {
			temp=b;
			System.out.println(b);
		}
		
		int c=temp%10;
		int d=temp/10;
		
		if(c>d)
		{
			System.out.println("The biggest digit is :"+c);
		}
		else
		{
			System.out.println("The biggest digit is" +d);
		}

	}

}

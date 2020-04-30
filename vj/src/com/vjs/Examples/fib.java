package com.vjs.Examples;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=10;
		int x=0;
		int y=1;
		int n;
		System.out.print(x+","+y);
		for(int a=2;a<=i;a++)
		{
			n=x+y; //1
			System.out.print(","+n);
			x=y;
			y=n;
			
		}
	}

}

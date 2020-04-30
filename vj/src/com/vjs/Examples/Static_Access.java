package com.vjs.Examples;

import java.util.Arrays;

public class Static_Access {

	static int i=10;
	
	public void A()
	{
		int i=20;
		System.out.println(i);
	}
	
	public void B()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Static_Access ob=new Static_Access();
	ob.B();
	ob.A();
	ob.B();
	int[] a={10,20,30};
	System.out.println("First Array"+Arrays.toString(a));
	
	int[] n={a[0]};
	System.out.println("New Array"+Arrays.toString(n));
		
	}

}

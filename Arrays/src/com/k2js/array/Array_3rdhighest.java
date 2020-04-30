package com.k2js.array;

import java.util.Arrays;

public class Array_3rdhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,7,1,8,9,4};//1,2,4,5,7,8,9
		
		int l=a.length;
		System.out.println(l);
		Arrays.sort(a);
		System.out.println(a[l-1]);
		System.out.println(a[l-2]);
		
		System.out.println(a[l-3]);

	}

}

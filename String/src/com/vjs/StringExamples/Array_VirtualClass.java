package com.vjs.StringExamples;

public class Array_VirtualClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {12,15,23,56,34};
		String s="hello string";
		//retrieving s reference class- i.e String
		System.out.println(s.getClass().getName());
		//It print the reference class i.e Array -[I
		System.out.println(a.getClass().getName());
		//It get the address of Array.
		System.out.println(a);
		//To print the first value
		System.out.println(a[0]);
		//To print the last value of Array
		int l=a.length-1;
		System.out.println(a[l]);
		
		//To print all the values in the array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}

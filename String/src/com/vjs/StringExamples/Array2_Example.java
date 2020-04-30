package com.vjs.StringExamples;

import java.util.Arrays;

public class Array2_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30};
		int b[]= {80,79,34};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int c[]= {a[0],b[1]};
		System.out.println(Arrays.toString(c));
		
		//to get all the values in array in separate line
		//foreach
		
		for(int v:a){
			System.out.println(v);
		}
	}

}

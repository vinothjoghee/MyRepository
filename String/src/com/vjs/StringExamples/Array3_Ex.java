package com.vjs.StringExamples;

public class Array3_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {12,10,5,6};
		String s[]=new String[] {"A","B","Cat","Dog"};
		
		Object ob[]=new Object[] {10,5.5,10>5,new int[] {5,6,7,8}};
		//for int
		for(int i:a) {
			System.out.println(i);
		}
		//for String
		for(String os:s) {
			System.out.println(os);
		}
		//for object
		
		for(Object o:ob) {
			if(o instanceof int[]) {
			int[]t=(int[])o;
			for(int i=0;i<t.length-1;i++) {
				System.out.println(t[i]);
			
			}
			
			}
			else {
				System.out.println(o);
			  }
		}

	}

}

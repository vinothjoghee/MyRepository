package com.vjs.StringExamples;

public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[] {5,8,1,3,4};
		String s[]=new String[] {"apple","banana","mango"};
		Object o[]=new Object[] {5,"orange",5.6,new int[] {11,22,33}};
		
		for(int a:i) {
			System.out.println(a);
		}
		
		for(String b:s) {
			System.out.println(b);
		}
		
		for(Object c:o) {
			if(c instanceof int[]) {
				int []t=(int[])c;
				
				for(int j=0;j<=t.length-1;j++) {
					System.out.println(t[j]);
				}
			}else
			System.out.println(c);
		}

	}

}

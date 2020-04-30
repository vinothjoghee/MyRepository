package com.vjs.StringExamples;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="sun-mon-tue-wed";
		String deliminater="-";
		String[]temp;
		temp=s1.split(deliminater);
		//System.out.println(temp[1]);
		int len=temp.length;
		System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.print(temp[i].toString());
			System.out.println();
		}
		
		

	}

}

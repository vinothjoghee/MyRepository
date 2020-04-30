package com.vjs.StringExamples;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="VinothQA test check";
		String s1="Vinoth";
		String s3="Vinoth";
		//s3=s3.concat("Test");
		//System.out.println(s.substring(6));
		//System.out.println(s.substring(0, 6));
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		String a="A,B,C,D,E,Fe,GE";
		String temp[];
		//String deliminater=",";
		temp=a.split(",");
		//int t=temp.length;
		System.out.println(temp);
		//System.out.println(t);
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		//System.out.println(s);
		//System.out.println(s1);
		//System.out.println(s3);

	}

}

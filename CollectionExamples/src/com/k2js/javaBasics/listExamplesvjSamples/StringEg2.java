package com.k2js.javaBasics.listExamplesvjSamples;

public class StringEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//index,lenght
		String s="rapid";
		int l=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.println(s.charAt(j));
		}
		
		for(int k=0;k<s.length();k++)
		{
			System.out.println(s.charAt(l-k));
		}
	}

}

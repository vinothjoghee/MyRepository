package com.vjs.Examples;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MOM";
		StringBuilder sb=new StringBuilder(s);
		String s1=sb.reverse().toString();
		System.out.println(s1);
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
				

	}

}

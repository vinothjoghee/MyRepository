package com.k2js.BasicPractice;

public class Palindrome {
	
	public static boolean getString(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String rev=sb.toString();
		if(s.contentEquals(rev))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(getString("nitin"));
       System.out.println(getString("mitin"));
		
	}

}

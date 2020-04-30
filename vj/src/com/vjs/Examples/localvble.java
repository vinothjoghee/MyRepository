package com.vjs.Examples;

public class localvble {
	
	static{
		System.out.println("Static stmt 1");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int i='A';	
			System.out.println(i);
			 {
				 i=40;
				System.out.println(i);	
			 }	
			 System.out.println(i);
			 
			}
	static{
		System.out.println("Static stmt 2");
	}
	

}

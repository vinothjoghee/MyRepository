package com.vjs.StringExamples;

public class charAtAsciivalues {
	
	static String s="HelAoworld";
	
	//to get first position of a String
	public static char firstpos() {
	
		char c=s.charAt(0);
		return c;
	}
	
	//to get the ascii value at the fourth position
	
	public static int getASCI() {
		char c=s.charAt(3);
		System.out.println(c);
		int a=new Integer(c);
		return a;
	}
	//to find the ascii value of a given string - 
		//find the first postion and lastposition and compare then find the biggest no
	
	
	public static void  ASCIFLPOS() {
		char a=s.charAt(0);
		int l=s.length();
		char b=s.charAt(l-1);
		System.out.println(a +""+b);
		int i=new Integer(a);
		int j=new Integer(b);
		System.out.println("First pos"+i);
		System.out.println("Lasr pos"+j);
		if(i>j)
		{
			System.out.println("This biggest no is "+i);
		}else
			System.out.println("This biggest no is "+j);
		
		
		
	}
	//find the ascii value (first,middle,last)of a given string and sum the sting 
	
	public static void AsciAvg() {
		char f=s.charAt(0);
		int len=s.length()-1;
		int avg=len/2;
		char m=s.charAt(avg);
		char l=s.charAt(len);
		System.out.println(f+""+m+""+l);
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charAtAsciivalues ob=new charAtAsciivalues();
		System.out.println(ob.firstpos());
		System.out.println(ob.getASCI());
		ob.ASCIFLPOS();
		ob.AsciAvg();
	}

}

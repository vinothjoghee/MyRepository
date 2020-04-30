package com.vjs.StringExamples;

public class StringRev {

	public  static void getString(String n)
	{
		
				
		for(int l=n.length()-1;l>=0;l--)
		{
			
			System.out.print(n.charAt(l));
			// s.toString();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRev o=new StringRev();
		o.getString("I am vijay");
		

	}

}

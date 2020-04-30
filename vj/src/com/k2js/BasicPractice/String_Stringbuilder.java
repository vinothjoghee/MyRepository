package com.k2js.BasicPractice;

public class String_Stringbuilder {
	
	public static String performanceString()
	{
		String s="Vinoth";
		for(int i=0;i<10000;i++)
		{
			s=s+"Joghee";
		}
		return s;
	}
	
	
    public static   String performanceStringbuilder()
	{
		StringBuffer sb=new StringBuffer("Vinoth");
		for(int i=0;i<10000;i++)
		{
			sb.append("Joghee");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  long startTime = System.currentTimeMillis();  
		  performanceString(); 
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        performanceStringbuilder();
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  

	}

}

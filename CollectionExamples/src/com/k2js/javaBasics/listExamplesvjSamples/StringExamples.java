package com.k2js.javaBasics.listExamplesvjSamples;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find how many r's are present in the string
		String s="mirror";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='r')
			{
				count++;				
			}
		}
		System.out.println("There were "+ count+"r's present in the given string ");
	}

}

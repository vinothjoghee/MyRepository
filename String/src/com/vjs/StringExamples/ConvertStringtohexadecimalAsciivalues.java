package com.vjs.StringExamples;

public class ConvertStringtohexadecimalAsciivalues {
	
	
	public static String stringtohexaecimalascii(String s)
	{
		String hex="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			//convert char into int  
			int a=(int)c;
			//convert into hexadecimalascii
			
			String h=Integer.toHexString(a);
			hex+=h;
		}
	
		return hex;	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ConvertStringtohexadecimalAsciivalues.stringtohexaecimalascii("Geek"));
		
	}

}

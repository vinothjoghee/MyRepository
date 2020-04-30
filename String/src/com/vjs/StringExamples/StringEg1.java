package com.vjs.StringExamples;

public class StringEg1 {
	
	public static String getString(String s) {
		
		String hex="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int c=(int)ch;
			
			String h=Integer.toHexString(c);
			hex+=h;
		}
		return hex;
	}
	
	public static String getString1(String s) {
		String sc="";
		for(int i=0;i<s.length();i+=2)
		{
			String spilt=s.substring(i,i+2);
			char c=(char)Integer.parseInt(spilt,16);
			//int ch=(int)c;
			//String asc=Integer.toString(ch);
			sc+=c;
		}
		return sc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getString("Geeks"));
		System.out.println(getString1("4765656b73"));
	}

}

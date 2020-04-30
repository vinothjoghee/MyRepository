package com.vjs.StringExamples;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello java";
		String s2=s1.replace('j', 'Z');
		System.out.println(s2);

		String s3=s1.replaceFirst("ja", "ta");
		System.out.println(s3);
		String s4=s1.replaceAll("lo", "ve");
		System.out.println(s4);
		
		String reverse=new StringBuffer(s1).reverse().toString();
		System.out.println(reverse);
	}

}

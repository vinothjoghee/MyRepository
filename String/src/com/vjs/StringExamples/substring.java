package com.vjs.StringExamples;

public class substring {
	
	
	public static String getString(String s,int i) {
		
		String ss=s.substring(1);
		return ss;
		
	}
	
	public static String test(String s,int a,int b) {
		String ss=s.substring(a, b);
		return ss;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		substring ob=new substring();
		System.out.println(ob.getString("vinoth",1));
		System.out.println(ob.test("vinoth",1,5));
		
	}

}

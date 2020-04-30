package com.vjs.StringExamples;

public class Method_1_2 {
	
	public static int m()
	{
		System.out.println(Method_1.s +""+Method_1_1.i);
		return Method_1.get();
	}
	
	public static String m1() {
		System.out.println(Method_1.s +""+Method_1_1.i);
		return (Method_1_1.get());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m());
		System.out.println(m1());
	}

}

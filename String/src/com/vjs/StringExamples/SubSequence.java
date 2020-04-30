package com.vjs.StringExamples;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hi Very good morning to all";
		
		System.out.println(s.subSequence(0, 20));
		
		//index out of bound array exception is thrown if the sequence is exceed
	//eg1
		//System.out.println(s.subSequence(-1, 2));
	//eg2
		//System.out.println(s.subSequence(0, 40));
	}

}

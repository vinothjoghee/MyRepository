package com.vjs.StringExamples;

public class StringlastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This example shows how to determine the last position of a substring inside a string

		String org="Hi hello , hello java";
		int lastpos=org.lastIndexOf("h");
		System.out.println(lastpos);
		if(lastpos==-1) {
			System.out.println("not found");
		}else {
			System.out.println("last position is at "+ lastpos);
		}

	}

}

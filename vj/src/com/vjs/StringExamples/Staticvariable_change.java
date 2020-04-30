package com.vjs.StringExamples;

public class Staticvariable_change {

	static int i=10;
	
	//static variable value can change in static block
		static {
			int j=Staticvariable_change.i=9;
			System.out.println(j);
		}
	//can change by assigning other values.
	

	static int j=Staticvariable_change.i=100;
	
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(Staticvariable_change.i);
   
   
	}

}

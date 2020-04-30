package com.vjs.StringExamples;

public class StaticVariable {
	//static variable will be loaded first with the default value and then static block is executed
	static {
		System.out.println("Im static"+StaticVariable.j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Im main method" + StaticVariable.j);
		}
	static int j=10; 
	}



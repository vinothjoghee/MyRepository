package com.k2js.am.inheritance;

public class MthdOverriding1_1 extends MthdOverriding1 {
	
	void Son() {
		System.out.println("Thank you dad for your asset");
	}
	
	//here comes the method overriding ,where it has same method name as that of parent class
	void marry() {
		System.out.println("I am not interested to marry now");
		super.marry();//to display parent class method behaviour ,you shoud use super keyword
	}
	
	//to display parent class method ,you shoud use super keyword
	
}

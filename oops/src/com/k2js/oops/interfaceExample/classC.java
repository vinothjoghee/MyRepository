package com.k2js.oops.interfaceExample;


//since classC cannot extends more than one super class ,interface is used. Interface is the solution for Multiple inheritance

//public class classC extends classA,classB{
public class classC extends classB{
	public static void main(String args[]) {
		
		classB ob=new classB();
		classA a=new classA();
		
		ob.Joghee();
		ob.Shanthi();
		a.Joghee();
		
	}
	
	

}

package com.k2js.oops.interfaceExample;

public class classCC implements classAA,classBB {

	@Override
	public void shanthi() {
		// TODO Auto-generated method stub
		System.out.println("I am shanthi");
		
	}

	@Override
	public void Joghee() {
		// TODO Auto-generated method stub
		System.out.println("I am Joghee");
		
	}
	
	public static void main(String ss[]) {
		classCC cc=new classCC();
		cc.Joghee();
		cc.shanthi();
		cc.Test();
	}

	

}

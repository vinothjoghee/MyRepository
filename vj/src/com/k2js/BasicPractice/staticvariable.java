package com.k2js.BasicPractice;



public class staticvariable {
	
	static int count=10;
	staticvariable()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticvariable ob1=new staticvariable();
		staticvariable ob2=new staticvariable();
		staticvariable ob3=new staticvariable();
	}

}

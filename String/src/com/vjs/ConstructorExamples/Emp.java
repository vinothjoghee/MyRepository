package com.vjs.ConstructorExamples;

public class Emp  extends Person{

	int salary;
	
	Emp(int id,String name,int salary){
		super(id,name);
		this.salary=salary;
		
	}
	
	String returndata() {
		return this.id+this.name+this.salary;
	}
	
	public static void main(String arg[]) {
		Emp e=new Emp(1,"vinoth",20000);
		
		System.out.println(e.returndata());
	}

}

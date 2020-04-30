package com.k2js.am.pack1;

public class Student {
	
	int id;
	String name;
	int mark[]=new int[6];
	int total;
	
	Student(String name,int id){
	
	this.name=name;
	this.id=id;
	}
	Student(String name,int id,int mark[])
	{
		this(name,id);
		this.mark=mark;
	}
	
	public String toString()
	{
		String m="0";
		for(int m1:mark) {
			m=m+m1 + "\t";
		}
		
		return "name= " +this.name+"\t"+"id= " + this.id+"\t"+"marks= "+ m+"\t"+"Total= "+this.total;
	}
}



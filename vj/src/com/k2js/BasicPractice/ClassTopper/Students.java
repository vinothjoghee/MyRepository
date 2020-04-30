package com.k2js.BasicPractice.ClassTopper;

public class Students {
	
	String name;
	int id;
	int marks[]=new int[6];
	int total;

	public Students(String name,int id,int marks[])
	{
		this(name, id);
		this.marks=marks;
		
	}
	public Students(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		String m="0";
		for(int t:marks)
		{
			m=m+t + "\t";
		}
		
		return "Name="+this.name+"\t"+"id="+this.id+"\t"+"marks="+m+"Total="+this.total;
	}
}

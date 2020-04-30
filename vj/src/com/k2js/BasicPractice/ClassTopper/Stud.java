package com.k2js.BasicPractice.ClassTopper;

public class Stud {

	String name;
	int id;
	int mark[]=new int[5];
	int total;
	String result;
	
	Stud(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	Stud(String name,int id,int mark[]){
	this(name,id);
	this.mark=mark;
	}
	
	public String toString() {
		String m="0";
		String res=null;
		
		for(int t:mark) {
			if(t>=40) {
				res="Pass";
				m=m+t +res+"\t" ;
			}
			
			else {
					res="Fail";
					m=m+t +res+"\t" ;
				}
			
		}
		return "Name="+this.name+"\t"+ "id="+this.id+"\t"+"Marks="+m+res+"Total="+this.total;
	}
}

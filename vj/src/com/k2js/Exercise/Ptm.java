package com.k2js.Exercise;

public class Ptm {
	
	String Employeename;
	int id;
	
	public Ptm()
	{
		System.out.println("Employee name and id is =");
	}
	
	public Ptm(String Employeename,int id)
	{
		this();
		this.Employeename=Employeename;
		this.id=id;
		//System.out.println(Employeename +"\t"+id);
	}
	
	
	public void display()
	{
		
		
		System.out.println(Employeename +"\t"+id);
		
	}

	
	public static void main(String[] args) {
		
		Ptm p=new Ptm("vj",34);
		/*System.out.println(p.Employeename);
		System.out.println(p.id);*/
	    
		
		p.display();
	}
}

	





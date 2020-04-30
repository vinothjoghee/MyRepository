package com.k2js.BasicPractice;

public class UnaryOperator {
	
	String name;
	int id;
	void getname(String n,int id) {
		this.name=n;
		this.id=id;
	}
	
	void display()
	{
		System.out.println(name+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnaryOperator obj=new UnaryOperator();
		UnaryOperator obj1=new UnaryOperator();
		obj.getname("vintoh \t", 101);
		obj1.getname("vj \t", 102);
		obj.display();
		obj1.display();
		/*UnaryOperator obj=new UnaryOperator();
		obj.id=001;
		obj.name="vinoth";
		System.out.println(obj.id+""+obj.name);*/
		
		
	}

}

package ConstructorExamples;



public class Voter1 {
	
	String name;
	int age;
	String location;
	
	Voter1(String name ,int age){
		this.name=name;
		this.age=age;
	}
	
	Voter1(String name,int age,String location){
		this(name,age);
		this.location=location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Voter1 v=new Voter1("vinoth",21);
System.out.println(v);
System.out.println(v.name);
System.out.println(v.age);
System.out.println(v.location);
	}

}

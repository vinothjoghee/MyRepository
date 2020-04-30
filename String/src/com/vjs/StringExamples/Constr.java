package com.vjs.StringExamples;

public class Constr {

	int i;
	String name;
	int j;
	String nm;
	Constr(int a,String b){
		this.i=a;
		this.name=b;
	
		System.out.println("THis is constructor block");
	}
	
	public void getdata(int i,String n) {
		this.j=i;
		this.nm=n;
	}
	
	static {
		System.out.println("This is static block");
	}
	
	 String tostring() {
		return this.i+this.name+this.j+this.nm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constr ob=new Constr(1,"cs");
		
		ob.getdata(22,"v");
		System.out.println(ob.tostring());

	}

}

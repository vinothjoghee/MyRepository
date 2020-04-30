package ConstructorExamples;

public class Eg2 {
	
	int a;
	int b;
	

	
	Eg2(){
		this.a=50;
		this.b=5;
			
	}
	
	void fun() {
		System.out.println(this.a-this.b);
	}
	
	public static void main(String are[]) {
		Eg2 ob=new Eg2();
		//ob.fun();
		//ob.get(70,50);
		ob.fun();
	}

}

package com.k2js.BasicPractice.ClassTopper;

public class Teach {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud s=new Stud("Vinoth",123);
		Stud s1=new Stud("test",124,new int [] {20,30});
		Stud s3=new Stud("test",124,new int [] {20,30,50,40,50,60});
		s.total=Teach.totalmark(s.mark);
		
		
		s1.total=Teach.totalmark(s1.mark);
		s3.total=Teach.totalmark(s3.mark);
		Teach.findtopper(s,s1,s3);
		System.out.println(s);		
		System.out.println(s1);	
		System.out.println(s3);
		
	
	}
	
	public static int totalmark(int m[])
	{
		int sum=0;
		for(int t:m) {
			sum=sum+t;
		}
		return sum;
	}
	
	
	
	static void findtopper(Stud...allstudents) {
		int maxmark=0;
		Stud topper=null;
		for(Stud s :allstudents)
		{
		
				
		
			if(s.total>maxmark)
			{
				maxmark=s.total;
				topper=s;
				
			}
		}
		System.out.println("The topper is + : " +topper);
	}

}

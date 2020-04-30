package com.k2js.BasicPractice.ClassTopper;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students("vinoth",123,new int[] {50,60,70});
		Students s1=new Students("anand",125,new int[] {50,60,70,80,70,60,40,30,78});
		Students s3=new Students("vinoth",123);
		s.total=Teacher.gettotal(s.marks);
		s1.total=Teacher.gettotal(s1.marks);
		s3.total=Teacher.gettotal(s3.marks);
		Teacher.findtopper(s,s1,s3);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		
		

	}
	static int gettotal(int mark[])
	{
		int sum=0;
		for(int m:mark)
		{
			sum=sum+m;
		}
		return sum;
	}
	
	static void findtopper(Students...allStudents)
	{
		int maxmark=0;
		Students topper=null;
		for(Students s:allStudents)
		{
			if(s.total>maxmark)
			{
				maxmark=s.total;
				topper=s;
			}

				
		}
		System.out.println("topper is"+ topper);
		
	}

}

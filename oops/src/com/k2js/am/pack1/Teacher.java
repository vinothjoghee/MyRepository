package com.k2js.am.pack1;
import com.k2js.am.pack1.*;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("vinoth",123, new int[] {20,23,24,12,12});
		Student s2=new Student("jitend",124,new int[] {40,50,60});
		Student s3=new Student("sabrish",344);
		s1.total=Teacher.getTotal(s1.mark);
		s2.total=Teacher.getTotal(s2.mark);
		s3.total=Teacher.getTotal(s3.mark);
		Teacher.findtopper(s2,s1,s3);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}	
		static int getTotal(int[] mark) {
			int sum=0;
			for(int t:mark) {
				sum=sum+t;
			}
			return sum;
		}
		
		
		static void findtopper(Student... allstudents) {
			
			int maxmark=0;
			Student topper=null;
			
			for(Student t:allstudents) {
			if(t.total>maxmark) {
				maxmark=t.total;
				topper=t;
			}
		}
			System.out.println(" topper is "+ topper);
		}

	

}

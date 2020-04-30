package com.vjs.StringExamples;

public class VariablEg {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int i=57;
	 int j=69;
	 int a=i/10;
	 int b=i%10;
	 int c=j/10;
	 int d=j%10;
	 if(i<j) {
		 if(a>b) {
			 System.out.println("In the smallest digit the biggest digit id"+a);
		 }else {
			 System.out.println("In the smallest digit the biggest digit id"+b); 
		 }
	 }
	 if(j>i) {
		 if(c<d) {
			 System.out.println("In the biggest digit the sallest number is " + c);
		 }else
		 {
			 System.out.println("In the biggest digit the sallest number is " + d);
		 }
	 }
	 
	}

}

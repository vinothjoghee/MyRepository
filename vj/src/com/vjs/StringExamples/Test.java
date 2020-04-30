package com.vjs.StringExamples;

public class Test {

	public void strrev(String rev) {
		int len=rev.length();
		System.out.println(len);
	   for(int i=len-1;i>=0;i--) {
		   System.out.print(rev.charAt(i));
		   
	   }
		
	}
	
	public void fibnoci(int a) {
		
		int b=0;
		int c=1;
		int temp;
		System.out.println();
		System.out.print(b +"\t");
		
		System.out.print(c+"\t");
		for(int i=0;i<a;i++) {
		  temp=b+c;
		  b=c;
		  c=temp;
		  System.out.print(temp + "\t");
			
		}
	}
	
	public static void main(String[] ss) {
	
    Test t=new Test();
    t.strrev("hi this is vunoth");
	t.fibnoci(15);
	
	}
}

package com.vjs.StringExamples;

public class forloop1 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=1;i--) {
			System.out.print(i + "\t");
			for(int j=1;j<=i;j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Example 2");
		//-----------------------------
		int c=0;
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				c=c+1;
				System.out.print(c +"\t");				
			}
			
			System.out.print(i);
			System.out.println();
			
		}
		
		
		///================
		System.out.println("Example 3");
		int d=0;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				 d=d+1;
				System.out.print(d);
			}
			System.out.println();
		}
		
		
		System.out.println("**************************************");
		for(int i=1,even=0;i<=10;even+=2,System.out.println(even),i++);
		
		//----------------------------
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		int a=1;
		for(int i=5;i>=1;	System.out.print(i+"\n"),i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(a +"\t");
				a++;
			}
		
			//System.out.println();
			
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		int k=0;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				k=k+1;
				System.out.print(k +"\t");
				
				
			}
			System.out.print(i);
			System.out.println();
		}
		
		
	}
}




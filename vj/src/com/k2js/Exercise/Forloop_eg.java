package com.k2js.Exercise;

public class Forloop_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.println("********************************************");
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=1;j--) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}

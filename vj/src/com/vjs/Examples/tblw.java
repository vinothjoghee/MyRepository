package com.vjs.Examples;

public class tblw {
	
	public static void Table(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	//to print table 1 to 10

	public static void printFirst10tables() {
	for(int i=1;i<=10;i++) {
		for(int j=i;j<=10;j++) {
	   System.out.println(i+"*" +j+"="+i*j);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Table(5);
       System.out.println("*****************************");
       printFirst10tables();
	}

}

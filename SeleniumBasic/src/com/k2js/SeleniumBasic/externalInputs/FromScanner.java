package com.k2js.SeleniumBasic.externalInputs;

import java.util.Scanner;

public class FromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Since we are getting input from the user this way is wrong
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browsername");
		String browser=sc.nextLine();
		System.out.println("Enter Runmode");
		String runmode=sc.next();
		System.out.println(browser);
		System.out.println(runmode);

	}

}

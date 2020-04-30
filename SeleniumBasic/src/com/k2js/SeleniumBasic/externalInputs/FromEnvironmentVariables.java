package com.k2js.SeleniumBasic.externalInputs;

public class FromEnvironmentVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browsername=System.getenv("bn");
		String runmode=System.getenv("rm");
		System.out.println(browsername);
		System.out.println(runmode);

	}

}

package com.k2js.interviewprocess.companies;

import com.k2js.interviewprocess.interviews.ManualTestInterview;

abstract class Mphasis implements ManualTestInterview {

	@Override
	public void round1_Telephonic() {
		// TODO Auto-generated method stub
		System.out.println("Mphasis is looking for 6 out of 10");
	}

	@Override
	public void round2_TechnicalFace_To_Face() {
		// TODO Auto-generated method stub
		System.out.println("Mphasis is looking for 5 out of 10");
	}

	@Override
	public void round3_domainknowlwdge() {
		// TODO Auto-generated method stub
		System.out.println("Mphasis is looking for Telecom domain");
	}

	@Override
	public void round1_communication() {
		// TODO Auto-generated method stub
		System.out.println("Mphasis is looking for 6 out of 10");
	}
	public abstract void automation();
	

}

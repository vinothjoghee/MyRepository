package com.k2js.interviewprocess.companies;

import com.k2js.interviewprocess.interviews.BackEndInterview;
import com.k2js.interviewprocess.interviews.FrontEndInterview;

abstract class EDS extends Mphasis implements FrontEndInterview,BackEndInterview{

	@Override
	public void round2_ProgrammingSkills() {
		// TODO Auto-generated method stub
		System.out.println("EDS is looking for 4 out of 10");
	}

	@Override
	public void round3_DBSkills() {
		// TODO Auto-generated method stub
		System.out.println("EDS is looking for 6 out of 10");
	}

	@Override
	public void round2_codingSkills() {
		// TODO Auto-generated method stub
		System.out.println("EDS is looking for 6 out of 10");
	}

	@Override
	public void round3_UIDesigning() {
		// TODO Auto-generated method stub
		System.out.println("EDS is looking for 6 out of 10");
	}

	
	public void round3_Domainknowledge() {
		System.out.println("EDS is looking for MainFrame");
	}

}

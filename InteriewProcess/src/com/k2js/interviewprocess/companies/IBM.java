package com.k2js.interviewprocess.companies;
import com.k2js.interviewprocess.interviews.BackEndInterview;
import com.k2js.interviewprocess.interviews.FrontEndInterview;

public class IBM implements FrontEndInterview,BackEndInterview{

	@Override
	public void round2_ProgrammingSkills() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for JAVA 7 out of 10");	
	}

	@Override
	public void round3_DBSkills() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for SQL 7 out of 10");
	}


	@Override
	public void round1_Telephonic() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for 7 out of 10");
	}

	@Override
	public void round2_codingSkills() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for HTML 5 ,CSS6,JScript 8 coding skill");
	}

	@Override
	public void round3_UIDesigning() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for HTML 5 , UI skill");
		
	}

	@Override
	public void round1_communication() {
		// TODO Auto-generated method stub
		System.out.println("IBM is looking for 7 out of 10");
	}

}

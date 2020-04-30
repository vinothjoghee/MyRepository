package com.k2js.interviewprocess.candidates;

import com.k2js.interviewprocess.companies.HP;
import com.k2js.interviewprocess.companies.MagnaConsultancy;
import com.k2js.interviewprocess.companies.QualityTest;
import com.k2js.interviewprocess.interviews.ManualTestInterview;

public class David {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QualityTest qt=new QualityTest();
		qt.script();
		ManualTestInterview.GiftCoupon();
		
		//HP hp=new HP();
		//10 mehtod will display for hp . 
		//Now to specify only for Manaulinterview use upcasting below hp.
		ManualTestInterview hp=new HP();
		hp.script();
		
		//now he will get only 4 methods.
		hp.round1_communication();
		hp.round1_Telephonic();
		hp.round2_TechnicalFace_To_Face();
		hp.round3_domainknowlwdge();
		
		MagnaConsultancy.conductInterview(qt);
	}

}

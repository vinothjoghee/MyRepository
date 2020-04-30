package com.k2js.interviewprocess.interviews;

 public interface ManualTestInterview extends CommonRounds{
	void round1_Telephonic();
	void round1_communication();
	void round2_TechnicalFace_To_Face();
	void round3_domainknowlwdge();
	
	default void script() {
		System.out.println("default 2 out of 10");
	}
	static void GiftCoupon() {
		System.out.println("Gift coupon is allowed whoever using this ManualTestInterview class");
	}
}


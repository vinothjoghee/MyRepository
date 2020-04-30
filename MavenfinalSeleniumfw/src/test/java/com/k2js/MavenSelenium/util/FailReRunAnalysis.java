package com.k2js.MavenSelenium.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailReRunAnalysis  implements IRetryAnalyzer{
	int minCount=0;
	int maxCount=2;


	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(minCount<maxCount)
		{
			minCount++;
			return true;
		}
		return false;
	}}

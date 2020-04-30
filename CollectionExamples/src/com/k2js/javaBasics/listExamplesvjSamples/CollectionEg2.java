package com.k2js.javaBasics.listExamplesvjSamples;

import java.util.ArrayList;
import java.util.List;

public class CollectionEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List  l=new ArrayList();
		l.add(10);
		l.add("30");
		l.add(new int[] {4,4,6,5});
		l.add(new int[] {4,2,5,5});
		//System.out.println(l);
		int sum=0;
		for(Object o : l)
		{
			if(o instanceof int[])
			{
				for(int t:(int[])o)
				{
					 sum=sum+t;
					//System.out.println(s);
				}				
			}
			else if(o instanceof Integer)
			{
				sum=sum+(Integer)o;
			}
			else if(o instanceof String){
				sum=sum+Integer.parseInt((String)o);
			}
			
		}
		System.out.println(sum);
	}

}

package com.k2js.BasicPractice;

import java.util.ArrayList;
import java.util.Collection;

public class Collectioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c=new ArrayList();
		c.add(10);
		c.add(20);
		c.add("50");
		c.add(new int[] {5,2,1});
		
		System.out.println(c);
		int sum=0;
		for(Object o:c)		{		
			//System.out.println(o);
			if(o instanceof Integer)
			{
				System.out.println(o);
				sum=sum+(Integer)o;
				
			}
			else if(o instanceof int[])
			{
				for(int t:(int[])o)
				{
					System.out.println(t);
					sum=sum+t;
				}
			}
			
			else if(o instanceof String)
			{
				System.out.println(Integer.parseInt((String)o));
				sum=sum+Integer.parseInt((String)o);
			}
			//System.out.println(sum);
		}
		//System.out.println(sum);
	}

}

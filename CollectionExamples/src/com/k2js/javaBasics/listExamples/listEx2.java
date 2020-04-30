package com.k2js.javaBasics.listExamples;

import java.util.ArrayList;
import java.util.Collection;

public class listEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add all the numbers inside the collections.
		Collection c = new ArrayList();
		c.add("20");
		c.add(10);
		c.add(new int[] { 5, 6, 7 });
		
		int sum=0;

		for (Object o : c) {
			if(o instanceof Integer)
			{
				sum=sum+(Integer)o;
			}
			
			else if (o instanceof int[]) {// object is equal to class
				
				for (int t:(int[])o) {
					sum=sum+t;			
					
				}
			}
				else if(o instanceof String)
				{
					sum=sum+Integer.parseInt((String)o);
				}
			
			
			}
			
		System.out.println(sum);
		}

	}



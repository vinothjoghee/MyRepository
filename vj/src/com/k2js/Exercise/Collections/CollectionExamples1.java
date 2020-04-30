package com.k2js.Exercise.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c = new ArrayList();
		c.add(1);
		c.add(20);
		c.add(30);
		c.add("20");
		c.add(new int[] { 1, 2, 3 });
		
		System.out.println(c);

		// c.forEach((x)->System.out.print(x));
        int sum=0;
		for (Object o : c) {
			if (o instanceof Integer) {

				System.out.println(o);
				sum=sum+(Integer)o;
			}

			else if (o instanceof int[]) {
				for (int t : (int[]) o) {
					System.out.println(t);
			    	sum=sum+t;
				}
			} else if (o instanceof String) {
				System.out.println(Integer.parseInt((String) o));
			     sum=sum+Integer.parseInt((String)o);
			}
		}
		System.out.println(sum);
	}
}

package com.k2js.javaBasics.listExamples;

import java.util.ArrayList;
import java.util.Collection;

public class listEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add("20");
		c.add(10);
		c.add(new int[] {5,6,7});
		c.add(10);
		
		System.out.println(c);
		c.remove(10);
	
		System.out.println(c);

		c.forEach((x)->System.out.println(x));
		//c.for
		System.out.println(c.size());
		

	}

}

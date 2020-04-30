package com.k2js.javaBasics.listExamplesvjSamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class CollectionEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List c=new ArrayList();
		c.add("vinoth");
		c.add("joghee");
		c.add(20);
		c.add(30.5);
		c.add(5>9);
		c.add("shanthi");
		//System.out.println(c);
		
		c.remove("shanthi");
		c.forEach((a)-> System.out.println(a));
		
		System.out.println("************************************");
		for(Object o:c)
		{
			System.out.println(o);
		}
		System.out.println("************************************");
		
		/*Collections.sort(c);
		System.out.println(c);
		System.out.println("************************************");*/
		
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		System.out.println("************************************");
		
		ListIterator <Integer> l=c.listIterator();
		for(;l.hasNext();)
		{
			System.out.println(l.next());
			
		}
		
		System.out.println("************************************");
		
	Iterator<Integer> ite=c.iterator();
	for(;ite.hasNext();)
		System.out.println(ite.next());
		
	}

	

}

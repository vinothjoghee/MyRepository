package com.k2js.javaBasics.listExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		s.add(100);
		s.add(1);
		s.add(10);
		s.add(100);
		s.add(null);
		s.add(5);
		s.add(1);
		System.out.println(s);
		
		//if you want the order same
		Set<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(100);
		ls.add(1);
		ls.add(10);
		ls.add(100);
		ls.add(null);
		ls.add(5);
		ls.add(1);
		System.out.println(ls);
		
		//you cannot sort in Set and hence treeset is used
		Set<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(1);
		ts.add(10);
		ts.add(100);
		//s.add(null);
		ts.add(5);
		ts.add(1);
	//1
		System.out.println(ts);
		//2
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		//3
		Iterable<Integer> itr=ls;
		System.out.println(ls);
		//4
		
	}

}

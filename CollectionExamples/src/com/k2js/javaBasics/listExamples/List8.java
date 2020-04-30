package com.k2js.javaBasics.listExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class List8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> car=new LinkedList<String>();
		car.add("Swift");
		car.add("i20");
		car.add("Baleno");
		car.add("Swift");
		
		Iterator itr=car.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
			

	}

}

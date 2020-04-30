package com.k2js.javaBasics.listExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList example
		ArrayList<String>car=new ArrayList();
		car.add("Swift");
		car.add("i20");
		car.add("Baleno");
		car.add("Nexon");
		car.add("Swift");
		Iterator itr=car.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

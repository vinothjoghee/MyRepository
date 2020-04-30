package com.k2js.javaBasics.listExamples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<String> fruits=Arrays.asList("Apple","Orange","Banana");
			//aslist is similar to add method in collection.to add the elements
			System.out.println(fruits);		
			List<String> vegetables=new LinkedList();
			vegetables.add("Carrot");
			vegetables.add("beetroot");
			vegetables.addAll(fruits);
			vegetables.add("Apple");
			System.out.println(vegetables);
			System.out.println(vegetables.get(0));
			System.out.println(vegetables.indexOf("beetroot"));
			System.out.println(vegetables.lastIndexOf("Apple"));
			System.out.println(vegetables.set(0,"karrot"));
			System.out.println(vegetables);
			System.out.println(vegetables.subList(0, 4));
	}

}

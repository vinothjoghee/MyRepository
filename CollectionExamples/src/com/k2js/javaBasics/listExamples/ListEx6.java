package com.k2js.javaBasics.listExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new Vector<Integer>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(40);
		System.out.println(l);
		System.out.println("*****************************************");
		// 2.
		l.forEach((x) -> System.out.println(x));
		System.out.println("*****************************************");
		// 3.
		l.forEach(System.out::println);
		System.out.println("*****************************************");
		// 4
		for (Integer t : l) {
			System.out.println(t);
		}
		System.out.println("*****************************************");
		// 5
		Iterator<Integer> it = l.iterator();
		for (; it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("*****************************************");
		// 6
		Collections.sort(l);
		System.out.println(l);
		System.out.println("*****************************************");
		// 7
		Collections.sort(l, (x, y) -> {
			if (x > y) {
				return -1;
			} else if (x == y) {
				return 0;
			}
			return 1;
		});
		System.out.println(l);
		System.out.println("*****************************************");
		// 8
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("*****************************************");
		// 9
		ListIterator<Integer> ite = l.listIterator();
		for (; ite.hasNext();) {
			System.out.println(ite.next());
		}
		
		//last 4 print statment are used for Array

	}

}

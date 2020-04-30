package com.k2js.Exercise.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l = new Vector<Integer>();
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(1, 15);
		
		System.out.println(l);
		for (Object o : l) {
			System.out.println(o);
		}

		l.forEach((x) -> System.out.print(x));

		ListIterator<Integer> ite = l.listIterator();
		System.out.println(ite);
		System.out.println("*************");
		for (; ite.hasNext();) {
			System.out.println(ite.next());
		}

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		Iterator<Integer> itr = l.iterator();
		for (; itr.hasNext();) {
			System.out.print(itr.next());
		}

	}

}

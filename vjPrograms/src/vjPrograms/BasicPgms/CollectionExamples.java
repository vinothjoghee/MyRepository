package vjPrograms.BasicPgms;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List Interface :Implementation using ArrayList class
		
		List li=new ArrayList();
		li.add("vinoth");
		li.add("vinoth");
		li.add(32);
		li.add(68.5);
		li.add(5>10);
		li.add(2,"Joghee");
		System.out.println("*****************ArrayList*******************");
		System.out.println(li);
		
		for(Object o:li) {
			System.out.println(o);
		}
		
		//List Interface :Implementation using LinkedList class
		List ll=new LinkedList();
		ll.add("Test");
		ll.add("Test");
		ll.add(50);
		ll.add(7.5);
		System.out.println("*****************LinkedList*******************");
		System.out.println(ll);
		for(Object ol:ll) {
			System.out.println(ol);
		}
		
		//Set Interface : Implementation using HashSet
		
		Set ss=new HashSet();
		ss.add("Hash Test");
		ss.add(23);
		ss.add(3.6);
		ss.add("Hash Test");
		System.out.println("**********HashSet*******");
		System.out.println(ss);
		for(Object os:ss) {
			System.out.println(os);
	
		}
		
		Set ts=new TreeSet();
		ts.add(10);
		ts.add(23);
		ts.add(36);
		ts.add(35);
		ts.add(36);
		ts.add(20);
		System.out.println("**********TreeSet*******");
		System.out.println(ts);
		for(Object os:ts) {
			System.out.println(os);
	
		}

	}

}

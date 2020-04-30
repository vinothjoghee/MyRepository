package com.k2js.javaBasics.listExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1000,"jit");
		m.put(101,"Teja");
		m.put(1,"vinoth");
		m.put(102,"gokul");
		m.put(101,"vinod");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		//5
	
		
		//m.forEach(System.out::println());
		
		m.forEach((x,y)->System.out.println(x+" "+y));
		//6
		for(Integer i:m.keySet())
		{
			int key=i;
			System.out.println(key + " "+m.get(key));
		}
		
		/*for(Integer<Integer,String> e.m.entrySet())
		{
			System.out.println(e.g);
		}*/

	}

}

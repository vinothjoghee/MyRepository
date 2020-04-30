package com.k2js.javaBasics.listExamples;

import java.util.ArrayList;
import java.util.List;

public class list9 {
	
	int id;
	String name;
	String address;
	
	public  list9(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating records
       list9 A=new list9(1,"Vinoth","xxx");
       list9 B=new list9(2,"Test","yyy");
       list9 C=new list9(3,"Arjun","zzz");
       //Adding record to list
       List<list9> list=new ArrayList<list9>();
       list.add(A);
       list.add(B);
       list.add(C);
       
       for(list9 T:list) {
    	   System.out.println(T.id+"\t"+T.name+"\t"+T.address);
       }
	}

}

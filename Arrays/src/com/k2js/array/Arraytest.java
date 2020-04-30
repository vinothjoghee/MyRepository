package com.k2js.array;

public class Arraytest {
	public static void main(String[] args) {
	
	int a[]=new int[]{5,4,3,2,1};
	String fruits[]=new String[] {"Mangao","Orange","Apple","Bananna","Lichi"};
	
  Object ob[]=new Object[] {5,5.5,"Mangao","Apple"};
	
	int li=a.length;
    int ls=fruits.length;
    int lo=ob.length;
    
    for(Object o: ob)
    {
    	System.out.println(o);
    }
    /*
    
    for(int i=0;i<li;i++)
    {
    	System.out.print(a[i]+"\t");
    }
    System.out.println("\n");
    for(int j=0;j<ls;j++)
    {
    	System.out.println(fruits[j]);
    }
    */
    for(int i=0;i<li;i++)
    {
    	for(int j=0;j<ls;j++)
    	{
    		System.out.print(a[i]+" "+fruits[j]);
    	}
    	System.out.println("\n");
    }
	
		// TODO Auto-generated method stub

	}

}

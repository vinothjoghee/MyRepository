package com.k2js.array;

public class Example1 {
	public static void main(String[] args) {
		/* int[]i= {10,20,30};
		 for(int j=0;j<i.length;j++ ) {
			 System.out.println(i[j]);
		 }*/
		 
		 Object[]obj= {"Jit",19,28,14.5,10>20,new int[]{5,6,7}};
		
		 
		 for(Object o:obj) {
			 if(o instanceof int[]) {//object is equal to class
				 int[]t=(int[]) o;
				 for(int k=t.length-1;k>=0;k--) {
					 System.out.println(t[k]);
				 }
			 }
		 }
		
			
	}

 
}

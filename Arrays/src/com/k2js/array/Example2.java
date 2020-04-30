package com.k2js.array;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[]obj=new Object[] {"Jit",19,28,14.5,10>20,new int[]{5,6,7}};
		
		 for(int i=0;i<obj.length;i++) {
			 if(obj[i] instanceof int[]) {//object is equal to class
				 int[]t=(int[]) obj[i];
				 for(int k=t.length-1;k>=0;k--) {
					 System.out.println(t[k]);
				 }
			 }
			 else {
				 System.out.println(obj[i]);
			 }
		 }
		
	}

}

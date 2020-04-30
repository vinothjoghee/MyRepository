package com.k2js.array;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object v=new Object[] {"Jit",19,28,14.5,10>20,new int[]{5,6,7},
				new String[] {"Hello",new String(new char[] {'W','O','R','L','D'})}};
		
		 Object[] obj=(Object[])v;
		 for(int i=0;i<obj.length;i++) {
			 if(obj[i] instanceof int[]) {//object is equal to class
				 int[]t=(int[]) obj[i];
				 for(int k=t.length-1;k>=0;k--) {
					 System.out.println(t[k]);
				 }
			 }
			 else if(obj[i] instanceof String[]) {
				 //System.out.println(obj[i].toString());
				 String[]s=(String[]) obj[i];
				 for(int l=s.length-1;l>=0;l--) {
					 System.out.println(s[l]);
				 }
				 
				 
			 }
			 else {
				 System.out.println(obj[i].toString());
			 }
		 
		 }

	}

}

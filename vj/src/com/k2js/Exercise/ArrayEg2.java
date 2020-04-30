package com.k2js.Exercise;

public class ArrayEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object []obj= {"Test",1,2,3,5>2,new int[] {5,6,7}};
		
		Object []v=new Object[] {"Jit",19,28,14.5,10>20,new int[]{5,6,7},
				new String[] {"Hello",new String(new char[] {'W','O','R','L','D'})}};
		
		Object[]obj=(Object[])v;
		for(int j=0;j<obj.length;j++)
		{			
			if(obj[j] instanceof int[])
			{
				int[]t=(int[])obj[j];
				for(int i=0;i<t.length;i++)
				{
					System.out.println(t[i]);
				}
			}
			
			
			else if(obj[j] instanceof String[])
			{
				String[]s=(String[])obj[j];
				for(int i=0;i<=s.length-1;i++)
				{
					System.out.println(s[i]);
				}
				
			}
			else
			{
				System.out.println(obj[j].toString());
				
			}
		}

	}

}

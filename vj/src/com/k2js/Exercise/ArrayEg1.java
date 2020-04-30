package com.k2js.Exercise;

public class ArrayEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]day= {1,2,3,4,5,6,7,8,9};
		String [] month= {"Jan","Feb","Mar"};
		/*for(int t:day)
		{
			System.out.println(t);
		}
		
		for(String m:month)
		{
			System.out.println(m);
		}*/
		System.out.println("****************************8");
		for(int i=0;i<=month.length-1;i++)
		{
			System.out.println(month[i]);
		}
		
		for(int i=month.length-1;i>=0;i--)
		{
			System.out.println(month[i]);
		}
	}

}

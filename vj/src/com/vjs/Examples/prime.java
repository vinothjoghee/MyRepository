package com.vjs.Examples;

public class prime {
	
	public void checkprime(int n)
	{
		int firstno=0,secondno=1,flag=0;
		
		int m=n/2;
		if(n==firstno || n==secondno)
		{
			System.out.println(n +" is a not a prime no");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0) {
		
					System.out.println(n+" is not a prime no");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Its a prime no");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime p=new prime();
 p.checkprime(14);
 p.checkprime(20);
	}

}

package com.k2js.BasicPractice;

public class Account {
	
	int accountno;
	String name;
	float amount;
	
	void deposit(int acno,String n,float amt )
	{
		this.accountno=acno;
		this.name=n;
		this.amount=this.amount+amt;
		System.out.println(this.amount+"deposited");
		
	}
	
	void withdraw(float amt)
	{
		if(this.amount<amt)
		{
			System.out.println("Insufficcient balance");
		}
		else
		{
			this.amount=this.amount-amt;
			System.out.println(this.amount+"amount withdraw");
		}
	}
	
	void checkbalance()
	{
		System.out.println(this.amount+"available balance");
	}
	
	void display()
	{
		System.out.println("Your account details"+this.accountno+this.name+this.amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();
		obj.deposit(12345,"vinoth",300);
		obj.withdraw(100);
		obj.checkbalance();
		obj.withdraw(100);
		obj.checkbalance();
		obj.display();
		
		
	}

}

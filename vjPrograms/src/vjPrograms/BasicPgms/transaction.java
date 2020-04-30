package vjPrograms.BasicPgms;

public class transaction {
	
	int Balance=1000;
	
	public void currentbalance()
	{
		 System.out.println("Your current balance is "+Balance);	
	}
	
	public void withdraw(int w) {
	
		int withdrawamount=w;
		if(withdrawamount<=Balance) {
			Balance=Balance-withdrawamount;
			System.out.println("Your transaction is successfull and the amount withdrawn is " +withdrawamount);
			System.out.println("Your current balance is "+Balance);
		}
			else {
				System.out.println("insufficient amount in your account balance");
		       System.out.println("Your current balance is "+Balance);
			}
		
	}
	
	public void canceltransaction(int c) {		
	
		System.out.println("Cancellation initiated for amount"+c);
		Balance=Balance+c;
		System.out.println("The  amount credited "+c);
		System.out.println("Updated balance is"+Balance);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transaction t=new transaction();
		t.currentbalance();
		t.withdraw(1000);
		t.canceltransaction(1000);
	}

}

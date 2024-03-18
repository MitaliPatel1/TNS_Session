package assignment;

public class BankAccount {
	long amount;
	
	long Withdraw;
	long Deposite;
	BankAccount(long amount){
		this.amount=amount;
		System.out.println("bank balance is "+amount);
		
	}
	void withdrawamount(long Withdraw) {
		this.Withdraw=Withdraw;
		this.amount=amount-Withdraw;
		System.out.println("withdraw amount is "+Withdraw);
		System.out.println("after withdraw balance is "+amount);
	}
	void depositeamount(long Deposite) {
		this.Deposite=Deposite;
		this.amount= amount+Deposite;
		System.out.println("deposite amount is "+Deposite);
		System.out.println("after deposite total amount is "+amount);
		
	}

}

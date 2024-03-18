
package assignment;

public class SavingAccount extends BankAccount {

	SavingAccount(long amount) {
		super(amount);
	}
		@Override
		void withdrawamount(long Withdraw) {
			if(amount<100  ) {
				System.out.println("  your balance is falls below one hundred so you can not withdraw.......");
				
			}
			else if(amount<=Withdraw) {
				System.out.println("your balance is  less than your withdraw amount .......");
				
			}
			else {
				super.withdrawamount(Withdraw);
			}
	}

}

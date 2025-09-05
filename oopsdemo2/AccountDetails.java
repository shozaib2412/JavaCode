package oopsdemo2;

/**
 * Author  : Shozaib.Zulfiqar
 * Date    : Sep 4, 2025
 * Time    : 9:54:56 AM
 * Project : CoreJava
 */

//child of savings bank : it has multiLevel inheritance

public class AccountDetails extends SavingsBank {

	int withdrawl, deposit, finalBalance;

	public AccountDetails(int accNo, String name, int min_bal, int balance, int withdrawl, int deposit,
			int finalBalance) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.finalBalance = finalBalance;
	}


	void display()
	{
		super.display(); // invokes savings bank display()method
		System.out.println ("Deposit: "+deposit);
		System.out.println ("Withdrawals: "+withdrawl);
		finalBalance=(balance+deposit)-withdrawl;
		System.out.println("Final Balance:" + finalBalance);
	}

}

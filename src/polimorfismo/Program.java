package polimorfismo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withdrow(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.00, 0.01);
		acc2.withdrow(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
		acc3.withdrow(200.00);
		System.out.println(acc3.getBalance());
	}

}

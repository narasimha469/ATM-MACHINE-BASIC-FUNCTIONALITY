package atmInterfaceSystem;

public class User {
	private double balance;

	public User(double initialBalance) {
		this.balance = initialBalance;
	}

	public void checkBalance() {
		System.out.println("Total Balance:"+balance);
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successfully:" + amount);
		} else {
			System.out.println("INVALID AMOUNT");
		}
	}

	public void withdrawAmount(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw Successfully:" + amount);
		} else {
			System.out.println("INSUFFICIENT BALANCE:" + amount);
		}
	}
}

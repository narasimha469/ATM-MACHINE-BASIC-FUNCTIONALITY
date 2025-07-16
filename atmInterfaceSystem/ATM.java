package atmInterfaceSystem;

import java.util.Scanner;

public class ATM {
	private User user;
	private Scanner sc;

	public ATM(User user) {
		this.user = user;
		this.sc = new Scanner(System.in);
	}

	public void start() {
		int choice;
		do {
			System.out.println("\n === ATM MENU ==== ");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Amount");
			System.out.println("3.WithDraw Amount");
			System.out.println("4.EXIT");
			System.out.println("enter the choice(1-4):");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				user.checkBalance();
				break;
			case 2:
				System.out.println("enter the deposit Amount:");
				double depositAmount = sc.nextDouble();
				user.deposit(depositAmount);
				break;
			case 3:
				System.out.println("enter the withdraw Amount:");
				double withdrawAmount = sc.nextDouble();
				user.withdrawAmount(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using ATM");
				break;
			default:
				System.out.println("INVALID Choice!Please enter the option between 1 to 4");
			}
		} while (choice != 4);
		  sc.close();

	}
}

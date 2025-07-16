package atmInterfaceSystem;

public class Main {

	public static void main(String[] args) {
		User user = new User(1000.0); // Initial Balance.
		ATM atm = new ATM(user);
		atm.start();

	}

}

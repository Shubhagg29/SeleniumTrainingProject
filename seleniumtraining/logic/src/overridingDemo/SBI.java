package overridingDemo;

public class SBI extends RBI implements Loan {

	public static void main(String[] args) {

		SBI home = new SBI();

		home.homeLoanIntrestRate();
		home.homeLoan();
		home.carLoan();
		home.Check();// Base Class method

		RBI home1 = new RBI();
		home1.homeLoanIntrestRate();

		RBI home3 = new SBI();
		home3.homeLoanIntrestRate();
		home3.Check();

	}

	public void homeLoanIntrestRate() {

		System.out.println("SBI home loan intrest rate SBI  8%");

	}

	// Interface methods Implemented
	@Override
	public void carLoan() {
		// System.out.println("Car Loan on special Rates");

	}

	@Override
	public void homeLoan() {
		System.out.println("Home Loan on special Rates");

	}

	
}

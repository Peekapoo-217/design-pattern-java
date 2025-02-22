package models;

public class CreditPayment implements PaymentMethod{
	@Override
	public void processPayment(double amount) {
		System.out.println("\nCredit Payment: "+ amount);
	}
}

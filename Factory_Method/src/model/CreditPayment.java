package model;

public class CreditPayment implements PaymentMethod{
	@Override
	public void paymentMethod(double amount) {
		System.out.println("\nCredit Payment: "+ amount);
	}
}

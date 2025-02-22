package models;

public class VisaPaymentMethod implements PaymentMethod{
	@Override
	public void processPayment(double amount) {
		System.out.println("\nVisa payment: "+ amount);
	}
}

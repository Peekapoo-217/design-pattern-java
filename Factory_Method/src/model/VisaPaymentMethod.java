package model;

public class VisaPaymentMethod implements PaymentMethod{
	@Override
	public void paymentMethod(double amount) {
		System.out.println("\nVisa payment: "+ amount);
	}
}

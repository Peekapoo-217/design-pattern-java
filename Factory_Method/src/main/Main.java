package main;

import enums.PaymentType;
import factories.AbstractPaymentFactory;
import factories.PaymentFactory;
import models.PaymentMethod;

public class Main {
	public static void main(String[] args) {
		AbstractPaymentFactory factory = PaymentFactory.createPaymentMethod(PaymentType.VISA);
		
		PaymentMethod paymentMethod = factory.createPaymentMethod();
		
		paymentMethod.processPayment(500);
	}
}

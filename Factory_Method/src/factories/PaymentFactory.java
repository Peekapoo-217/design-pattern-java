package factories;

import enums.PaymentType;
import models.CreditPayment;
import models.PaymentMethod;
import models.VisaPaymentMethod;

public class PaymentFactory {
	public static AbstractPaymentFactory createPaymentMethod(PaymentType type) {
		switch (type) {
		case CREDIT:
			return new CreditPaymentMethodFactory();
		case VISA:
			return new VisaPaymentMethodFactory();
			default: throw new IllegalAccessError("Invalid Payment Method!");
		}
	}
}

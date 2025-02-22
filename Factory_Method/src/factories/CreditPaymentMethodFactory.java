package factories;

import models.CreditPayment;
import models.PaymentMethod;

public class CreditPaymentMethodFactory extends AbstractPaymentFactory{
	@Override
	public PaymentMethod createPaymentMethod() {
		return new CreditPayment();
	}
}

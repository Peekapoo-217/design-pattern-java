package factories;

import models.PaymentMethod;
import models.VisaPaymentMethod;

public class VisaPaymentMethodFactory extends AbstractPaymentFactory{
	@Override
	public PaymentMethod createPaymentMethod() {
		return new VisaPaymentMethod();
	}
}

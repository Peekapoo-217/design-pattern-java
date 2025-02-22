package factories;
import models.PaymentMethod;

public abstract class AbstractPaymentFactory {
	public abstract PaymentMethod createPaymentMethod(); 
}

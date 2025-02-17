package factory;
import model.PaymentMethod;

public abstract class AbstractPaymentFactory {
	public abstract PaymentMethod createPaymentMethod(); 
}

package AdaptorPattern;

public class AdaptorExample {

	/**
	 * Create a LegacyPaymentGateway class, with some method like 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LegacyPaymentGateway legacyPaymentGateway = new LegacyPaymentGateway();
		legacyPaymentGateway.oldPayMethod(12); //12 USD
		
		
		ModernPaymentGateway newPaymentGateway = new ModernPaymentGateway();
		newPaymentGateway.pay(900);
		
		IPayable legacyAdaptedToModernPaymentGateway = new Adaptor(new LegacyPaymentGateway());
		//we're paying in Rupees with the Legacy Payment Gateway which supports only USD.
		legacyAdaptedToModernPaymentGateway.pay(890); 
	}

}

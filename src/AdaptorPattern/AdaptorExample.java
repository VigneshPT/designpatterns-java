package AdaptorPattern;

public class AdaptorExample {

	/**
	 * Create a LegacyPaymentGateway class, with some method like oldPayMethod, which expects USD
	 * Create an interface for new systems IPayable with `pay` method that expects INR. 
	 * Create a concrete class for that interface, something like ModernPaymentGateway
	 * Create an Adapter class which implements the new Interface
	 * Create a constructor which accepts the legacy object and save it
 	 * implement the interface method, transform the input from the adapter and pass to legacy method.
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

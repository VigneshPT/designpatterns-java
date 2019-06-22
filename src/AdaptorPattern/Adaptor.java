package AdaptorPattern;

public class Adaptor implements IPayable {
	LegacyPaymentGateway legacyPaymentGateway;
	static final int exchangeRateForUSD = 70;
	
	public Adaptor(LegacyPaymentGateway legacyPaymentGateway) {
		this.legacyPaymentGateway = legacyPaymentGateway;
	}

	@Override
	public void pay(int inRupees) {
		// TODO Auto-generated method stub
		
		double valueInUSD = (double)inRupees/(double)exchangeRateForUSD;
		
		System.out.println("\nPaying through new interface using Adapter to pay with legacy system");
		this.legacyPaymentGateway.oldPayMethod(valueInUSD);
		
	}
	
	
}

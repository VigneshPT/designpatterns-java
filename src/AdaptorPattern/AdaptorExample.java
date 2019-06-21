package AdaptorPattern;

public class AdaptorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPayable paymentGateway = new Adaptor(new LegacyPaymentGateway());
		paymentGateway.pay(890);
	}

}

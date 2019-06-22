package AdaptorPattern;

public class LegacyPaymentGateway {
	public void oldPayMethod(double payInUSD) {
		System.out.println("Paid "+ payInUSD + "USD through legacy");
	}
}

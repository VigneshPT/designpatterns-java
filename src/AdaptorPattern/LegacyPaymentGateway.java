package AdaptorPattern;

public class LegacyPaymentGateway {
	public void pay(double payInUSD) {
		System.out.println("Paid "+ payInUSD + "USD through legacy");
	}
}

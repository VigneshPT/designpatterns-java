package AdaptorPattern;

public class ModernPaymentGateway implements IPayable {

	@Override
	public void pay(int inRupees) {
		// TODO Auto-generated method stub
		System.out.println("Paid "+ inRupees + " through the new system");
	}
 
}

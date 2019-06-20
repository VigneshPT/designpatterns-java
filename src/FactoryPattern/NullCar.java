package FactoryPattern;

public class NullCar implements ICar{

	@Override
	public void drive() throws UnavailableCarException {
		// TODO Auto-generated method stub
		System.out.println("log the error. gather more info.");
		throw new UnavailableCarException();
	}
	
}

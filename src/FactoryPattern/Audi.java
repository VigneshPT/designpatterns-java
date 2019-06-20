package FactoryPattern;

public class Audi implements ICar{

	@Override
	public void drive() throws UnavailableCarException {
		// TODO Auto-generated method stub
		System.out.println("It's an Audi.");
	}

}

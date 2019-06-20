package FactoryPattern;

public class CarSuggestionExample {
	public static void main(String[] args) {
		
		ICar car = CarFactory.getCar(40);
		try {
			car.drive();
		} catch (UnavailableCarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not handled the exception. Wrong budget, or out of reach.");
		}
	}
}

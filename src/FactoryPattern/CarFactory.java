package FactoryPattern;

public class CarFactory {
	public static ICar getCar(int budget) {
		ICar car = null;
		if(budget < 5) {
			car = new Maruti800();
		} else if (budget < 50 ) {
			car = new Audi();
		} else {
			car = new NullCar();
		}
		return car;
	}
}

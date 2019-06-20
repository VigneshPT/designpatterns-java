package StrategyPattern.ducks;


/**
 * Start with this.. 
 * 
 * and add a `fly` method, with a print statement.
 * then run the program and show that Rubber Duck is flying.. 
 * 
 * so, next step, show that you can override the fly() method in the rubber duck.
 * 
 * next add another class. `WoodenDuck` which is not supposed to fly or quack. So override both. 
 * 
 * Then introduce interface `Flyable` and only flying ducks can implement that interface
 * This makes it mandatory and difficult to implement the fly in all the places. 
 * 
 * Create classes for each behaviour.. and implement the FlyBehavior interface
 * `FlyNoWay` `FlyWithWings`. Also create QuackBehavior interface, and create concrete behavior classes
 * `Quack` `Squeak` `MuteQuack`
 * 
 * To the Duck class, add two instance variables `flyBehavior` `quackBehavior` (Interface type)
 *
 * Remove the fly and quack methods from Duck. Replace it with `performFly` and `performQuack`
 * 
 * performQuack(){ quackBehavior.quack(); };
 * 
 * e.g. class WildDuck extends Duck {
 * 	public RubberDuck(){
 * 		quackBehavior = new Squeak();
 * 		flyBehavior = new FlyNoWay();
 * 	}
 * 	
 * 	public void display(){
 * 		....
 * 	}
 * }
 * 
 * public class DuckSimulator{
 * 	public static void main(String[] args){
 * 		Duck wildDuck = new WildDuck();
 * 		wildDuck.performQuack();
 * 		wildDuck.performFly();
 * 	}
 * }
 * 
 * 
 * Setting the behavior dynamically. 
 * introduce setFlyBehavior() method to the Duck class, which assigns the behavior passed.
 * 
 * Duck wildDuck = new WildDuck();
 * wildDuck.setFlyBehavior(new Quack());
 * wildDuck.performFly();
 * 
 * @author vigneshpt
 *
 */
public class Duck {
	
	public void quack() {}
	
	public void display() {};
}

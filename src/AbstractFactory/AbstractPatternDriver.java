package AbstractFactory;

public class AbstractPatternDriver {
	
	/**
	 * Create an Animal Interface.. with getType() and makeSound() with just print statements
	 * Then Concrete classes for Duck, Dog, implementing Animal etc.
	 * 
	 *	Similarly Color Interface, with getColor(), and concrete classes like Brown, White, etc.
	 * Create an AbstractFactory interface that accepts parameterized type. 
	 * with a create() method that returns T type.
	 * 
	 * create AnimalFactory class that implements AbstractFactory<Animal>
	 * and implement create() method
	 * 
	 * create ColorFactory class implementing AbstractFactory<Color>
	 * and implement create()
	 * 
	 * Create FactoryProvider class with static getFactory() accepting string `choice` as parameter
	 * return new AnimalFactory() or new ColorFactory() based on input. 
	 * 
	 * In main() function, use FactoryProvider.getFactory()
	 * @param args
	 */
	
	
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        
        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Dog");
        
        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");
        
        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();
        
        System.out.println(result);
    }
}
package factorypattern;
public class Circle implements Shape {

	/**
	 * Printing a String for JUnit testing
	 */
	@Override
	public void draw() {
    	System.out.println("Inside Circle::draw() method.");
	}
	
}

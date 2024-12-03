package facadepattern;

/** A Facade pattern is when a class implements the methods of other classes(usually implemented by an interface) as getters functions.
 * For example, a class has a method draw, the main class then implements a getter function for that class' method. 
 * Hence, we will be testing the main class using JUnit to test all the methods through that main class' getter functions for the 'inner' methods.
 * @author Ghouse
 */

public class FacadePatternDemo {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();		
	}
}

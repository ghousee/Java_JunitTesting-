package factorypattern;
/**Similar to Facade Pattern but the Factory Pattern does not instantiate objects through a constructor but instead uses a regular function
 * to call the required methods(or the individual implementations i.e drawCircle, drawRectangle).
 * @author Ghouse
 */

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Circle
		shape1.draw();

		//get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Rectangle
		shape2.draw();

		//get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of square
		shape3.draw();
	}

}

package facadepattern;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Ghouse
 */
public class FacadePatternTest {
	/**
	 * Testing the drawCircle() method (which is an individual implementation) via FacadePatternDemo.java instead of Circle.java or ShapeMaker.java
	 */
	@Test
	public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();

        //positive test cases
        assertEquals(expResult, result);
        assertEquals("Circle::draw()", instance.drawCircle());

        //negative test cases
        assertNotEquals("Not Circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
	}
	

	/**
	 * Testing the drawRectangle() method.
	 */
	@Test
	public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();


        //positive test cases
        assertEquals(expResult, result);
        assertEquals("Rectangle::draw()", instance.drawRectangle());

        //negative test cases
        assertNotEquals("Not Rectangle", instance.drawRectangle());
        assertNotEquals("Rectangle", instance.drawRectangle());
	}
	
	
	/**
	 * Testing the drawSquare() method.
	 */
	@Test
	public void testDrawSquare() {

        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();

        String expResult = "Square::draw()";
        String result = instance.drawSquare();

        //positive test cases
        assertEquals(expResult, result);
        assertEquals("Square::draw()", instance.drawSquare());

        //negative test cases
        assertNotEquals("Not Rectangle", instance.drawSquare());
        assertNotEquals("Square", instance.drawSquare());
	}

}

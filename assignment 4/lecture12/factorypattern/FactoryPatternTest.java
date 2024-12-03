package factorypattern;

import static org.junit.Assert.*;
/**
 * @author Ghouse
 */

import org.junit.Test;

public class FactoryPatternTest {
	
	/**
	 * Testing the getShape() method in FactoryPatternDemo class.
	 */
	@Test
	public void testGetShape() {       
       
        ShapeFactory factory = new ShapeFactory();
        
        Shape circle = factory.getShape("Circle");
        
        assertNotNull(circle);
        
        assertTrue(circle instanceof Circle);
        
        Shape rectangle = factory.getShape("Rectangle");
        
        assertNotNull(rectangle);
        
        assertTrue(rectangle instanceof Rectangle);
        
        
        Shape square = factory.getShape("Square");
        
        assertNotNull(square);
        
        assertTrue(square instanceof Square);
	}

}

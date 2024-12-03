package singletonpattern;

import static org.junit.Assert.*;

/**
 * @author Ghouse
 */
import singletonpattern.SingleObject;

import org.junit.Test;

public class SingleObjectTest {
	
    /**
     * Testing the getInstance() method of class SingleObject.
     */
    @Test
    public void testGetInstance() {
		//fail("Not yet implemented");
        System.out.println("getInstance()");
        SingleObject instance = new SingleObject();
        String expResult = "Hello World!";
        String result = instance.showMessage();


        assertEquals(expResult, result);
        assertSame(expResult, result);

    }

    /**
     * Testing the showMessage() method of class SingleObject.
     */
	@Test
	public void testShowMessage() {
		//fail("Not yet implemented");
        System.out.println("showMessage()");
        SingleObject instance = new SingleObject();
        String expResult = "Hello World!";
        String result = instance.showMessage();

        assertEquals(expResult, result);
        assertSame(expResult, result);
	}

}

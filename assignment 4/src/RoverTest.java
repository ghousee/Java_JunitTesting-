import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * @author Ghouse
 */
class RoverTest {

	@Test
	void testPressRightPedal() {
        State st = new State(); // Create new instance of State class
        assertFalse(st.pressRightPedal(1)); //call the specific method and test using JUnit Testing method i.e assertFalse
        System.out.println("RightPedal Tested Successfully!!!");
	}

	@Test
	void testPressRightPedalForTime() {
        State st = new State();
        assertFalse(st.pressRightPedal(1));
        System.out.println("RightPedalForTime Tested Successfully!!!");
		
	}

	@Test
	void testPressLeftPedal() {
        State st = new State();
        assertFalse(st.pressLeftPedal(1));
        System.out.println("LeftPedalForTime Tested Successfully!!!");
	}

	@Test
	void testPressLeftPedalForTime() {
        State st = new State();
        assertFalse(st.pressLeftPedal(1));
        System.out.println("LeftPedalForTime Tested Successfully!!!");
	}

	/**
	 * Example of failing test case.
	 */
	@Test
	void testPrintStateAndSubState() {
//		State st = new State();
		assertFalse(st.printStateAndSubState());
		System.out.println("PrintStateandSubState Tested Successfully!!!");
	}

}

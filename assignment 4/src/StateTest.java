import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StateTest {

	@Test
	void testState() {
		fail("Not yet implemented");
	}

	@Test
	void testPressRightPedal() {
		State s = new State();
		assertFalse(s.pressRightPedal(1));
	}

}

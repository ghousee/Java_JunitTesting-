import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class AtRestTest {

	@Test
	void test() {
		
		AtRest a = new AtRest();
		
		assertTrue(a.pressLeftPedalForTime(2));
		
	}

}

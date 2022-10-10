import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		String question = "2+2";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "4";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		question = "5+7";
		answer = Calculator.Calculator(question);
		expectedAnswer = "12";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}

}

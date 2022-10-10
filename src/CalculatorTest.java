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
	
	@Test
	public void testSubtraction() {
		String question = "9-4";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "5";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testMultiplication() {
		String question = "4*6";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "24";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testAdditionwithSubtraction() {
		String question = "7+9-4";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "12";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testAdditionwithMultiplication() { //doesnt follow the rules of BIMDAS/BODMAS
		String question = "2+5*7";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "49";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtractionwithMultiplication() {
		String question = "9-4*2";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "10";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}

}

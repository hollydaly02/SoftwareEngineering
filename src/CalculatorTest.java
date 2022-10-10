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
	public void testAdditionwithMultiplication() { 
		String question = "2+5*7";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "37";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtractionwithMultiplication() {
		String question = "9-4*2";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "1";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtractionAndAdditionwithMultiplication() {
		// -+*
		String question = "50-4+5*8";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "86";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// *+-
		question = "10*2+5-7";
		answer = Calculator.Calculator(question);
		expectedAnswer = "18"; //XXXX
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +-*
		question = "6+4-5*77";
		answer = Calculator.Calculator(question);
		expectedAnswer = "-375";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// *-+
		question = "72*3-8+9";
		answer = Calculator.Calculator(question);
		expectedAnswer = "217";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +*-
		question = "30+14*6-5";
		answer = Calculator.Calculator(question);
		expectedAnswer = "109";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +*-
		question = "8+66*4-57";
		answer = Calculator.Calculator(question);
		expectedAnswer = "215";
				
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testExampleGiven() {
		String question = "12435+34569-12345*10+50";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "-76396";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void failedTest () {
		String question = "2+2";
		String answer = Calculator.Calculator(question);
		String expectedAnswer = "3";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	
	}

}
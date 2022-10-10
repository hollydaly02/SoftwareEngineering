package Calculator.Calculator2;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

	@Test
	public void testAddition() {
		String question = "2+2";
		String answer = App.Calculator(question);
		String expectedAnswer = "4";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		question = "5+7";
		answer = App.Calculator(question);
		expectedAnswer = "12";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtraction() {
		String question = "9-4";
		String answer = App.Calculator(question);
		String expectedAnswer = "5";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testMultiplication() {
		String question = "4*6";
		String answer = App.Calculator(question);
		String expectedAnswer = "24";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testAdditionwithSubtraction() {
		String question = "7+9-4";
		String answer = App.Calculator(question);
		String expectedAnswer = "12";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testAdditionwithMultiplication() { 
		String question = "2+5*7";
		String answer = App.Calculator(question);
		String expectedAnswer = "37";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtractionwithMultiplication() {
		String question = "9-4*2";
		String answer = App.Calculator(question);
		String expectedAnswer = "1";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testSubtractionAndAdditionwithMultiplication() {
		// -+*
		String question = "50-4+5*8";
		String answer = App.Calculator(question);
		String expectedAnswer = "86";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// *+-
		question = "10*2+5-7";
		answer = App.Calculator(question);
		expectedAnswer = "18"; //XXXX
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +-*
		question = "6+4-5*77";
		answer = App.Calculator(question);
		expectedAnswer = "-375";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// *-+
		question = "72*3-8+9";
		answer = App.Calculator(question);
		expectedAnswer = "217";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +*-
		question = "30+14*6-5";
		answer = App.Calculator(question);
		expectedAnswer = "109";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
		
		// +*-
		question = "8+66*4-57";
		answer = App.Calculator(question);
		expectedAnswer = "215";
				
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Test
	public void testExampleGiven() {
		String question = "12435+34569-12345*10+50";
		String answer = App.Calculator(question);
		String expectedAnswer = "-76396";
		
		assertEquals ("The expected answer must match the answer.", expectedAnswer, answer);
	}
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void testRepeatOperators() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("Repeat operators");
        String question = "1++2";
        String answer = App.Calculator(question);

        exception.expect(ArithmeticException.class);
        exception.expectMessage("Repeat operators");
         question = "3-2";
         answer = App.Calculator(question);

        exception.expect(ArithmeticException.class);
        exception.expectMessage("Repeat operators");
         question = "5+72-+1";
         answer = App.Calculator(question);

        }

}
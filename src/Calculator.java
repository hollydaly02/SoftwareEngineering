/* A Java program to evaluate a
given expression where userInput
are separated by space.
*/
import java.util.Stack;
import java.util.Scanner;

public class Calculator {
    public static String Calculator(String expression) {
        char[] userInput = expression.toCharArray();          // Converts string to sequence of characters

        Stack<Integer> numbers = new Stack<Integer>();        // Stack for numbers
        Stack<Character> operators = new Stack<Character>();  // Stack for operators

        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == ' ')
                continue;                                     // Ignore blank space

            
            if (userInput[i] >= '0' && userInput[i] <= '9') { // If character is a number, we push to the number stack
                StringBuffer sbuf = new StringBuffer();

                while (i < userInput.length &&                // If there is more than one digit in the number, we neeed to append the digit in the stack and push
                        userInput[i] >= '0' &&
                        userInput[i] <= '9')
                    sbuf.append(userInput[i++]);              
                numbers.push(Integer.parseInt(sbuf.toString()));

                i--;                                          // Correcting the offset, points to the character next to digit but the for loop increments i as well            
            }

            else if (userInput[i] == '+' ||                   // If character is an operator (not including division)
                     userInput[i] == '-' ||
                     userInput[i] == '*' ) {

            	char x = userInput[i+1];                      // If two operators follow each other, throw exception
            	if(x == '+' ||                   
                   x == '-' ||
                   x == '*' ) {
            		throw new ArithmeticException("Repeat operators"); 
            	}

                while (!operators.empty() &&                  // While the operator at the top of the stack has the same or greater precedence as the current operator
                        hasPrecedence(userInput[i],operators.peek()))
                    numbers.push(applyOp(operators.pop(),
                                         numbers.pop(),
                                         numbers.pop()));     // Apply the operator on the top of the stack to the top two elements in numbers stack
                operators.push(userInput[i]);                 // Push current character to operators stack
            }
        }

        while (!operators.empty())                            // Apply the remaining operators to their corresponding numbers
            numbers.push(applyOp(operators.pop(),
                                 numbers.pop(),
                                 numbers.pop()));
        
        return String.valueOf(numbers.pop());                 // The character at the top of the numbers stack is our result, return result     
    }

    public static boolean hasPrecedence(char operator1, char operator2) { 
        if ((operator1 == '*') &&
                (operator2 == '+' || operator2 == '-'))       // If the second operator has a lower precedence than the first, we return false
            return false;
        else
            return true;                                      // otherwise we return true, for higher precedence
    }

    
    public static int applyOp(char operator, int b, int a) {  // applying the operand and returning its result
        switch (operator) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while(quit==false) {                                  // While the user still wishes to use the calculator, take in their expression and return its answer
        	System.out.println("Enter mathematical expression here or enter quit ");
            String mathExpression = sc.nextLine();
        	if (mathExpression.matches("quit")) {             // If the user inputs quit, the program will end
                quit = true;
                break;
            }
        	else {
        	System.out.println(Calculator.Calculator(mathExpression));
        	}
        }
        System.out.println("Goodbye");
        sc.close();
    }
}
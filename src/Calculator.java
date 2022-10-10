import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mathematical expression here: "); //takes in user input
        String mathExpression = sc.nextLine();
        String answer = Calculator(mathExpression);
        System.out.println(answer);
    }

    public static String Calculator(String str){
        String numbers[] = str.replaceAll("[+*-]","").split(""); //array of only the numbers in the string
        String operators [] = str.replaceAll("[0-9]","").split(""); //array of operators passed in

        int total = Integer.parseInt(numbers[0]); //total is set to be the first number in the array

        for (int i=0; i<operators.length; i++) { //for loop - iterates until no more operators are left
            switch (operators[i]) {
            case "+" : //addition
                total += Integer.parseInt(numbers[i+1]); //i + 1 used to add the next number to the total
                break;
            case "-" : //subtraction
                total -= Integer.parseInt(numbers[i+1]);
                break;
            case "*" : //multiplication
                total *= Integer.parseInt(numbers[i+1]);
                break;
            default: //when no operators are passed in
              total = total;
            }
        }
        return String.valueOf(total); //returning the final total as a String
    }
}

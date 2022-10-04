import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mathematical expression here: ");
        String mathExpression = sc.nextLine();
        String answer = Calculator(mathExpression);
        System.out.println(answer);
    }
    
    public static String Calculator(String str){
        String numbers[] = str.replaceAll("[+*-]","").split(""); //array of only the numbers in the string
        String operators [] = str.replaceAll("[0-9]","").split(""); //array of operators passed in

        int total = Integer.parseInt(numbers[0]);

        for (int i=0; i<operators.length; i++) {
            switch (operators[i]) {
            case "+" :
                total += Integer.parseInt(numbers[i+1]);
                break;
            case "-" :
                total -= Integer.parseInt(numbers[i+1]);
                break;
            case "*" :
                total *= Integer.parseInt(numbers[i+1]);
                break;
            }
        }
        return String.valueOf(total);
    }
}
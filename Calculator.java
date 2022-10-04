import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mathematical expression here: ");
        String mathExpression = sc.nextLine();
        String numbers[] = mathExpression.replaceAll("[+*-]","").split(""); //array of only the numbers in the string
        String operators [] = mathExpression.replaceAll("[0-9]","").split(""); //array of operators passed in
    }

}

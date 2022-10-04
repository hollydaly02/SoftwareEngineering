import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mathematical expression here: ");
        String mathExpression = sc.nextLine();

        public static String Calculator(String str) {
            String numbers[] = str.replaceAll("[+*-]","").split(""); //array of only the numbers in the string
            String operators [] = str.replaceAll("[0-9]","").split(""); //array of operators passed in
        }
    }

}
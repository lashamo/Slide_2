import java.util.Scanner;

/**
 * Create simple calculator. Client should enter two number and one operation(+ - * /) and the program should print the result
 */

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two number");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter any operation(+, -, * or /)");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (operation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if ( operation == '*') {
            System.out.println((long) firstNumber * secondNumber);
        } else if (operation == '/') {
            System.out.println("Divide as numbers: " + firstNumber / secondNumber);
            System.out.println("Divide as double: " + ((double) firstNumber / secondNumber));
        } else {
            System.out.println("Not valid operation, please enter +, -, * or /");
        }
    }
}

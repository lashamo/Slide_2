import java.util.Scanner;

/**
 * დაადგინეთ სამ მოცემულ როცხვს შორის რომელი არის უდიდესი
 */
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three number");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The biggest number is" + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The biggest number is " + secondNumber);
        } else {
            System.out.println("The biggest number is " + thirdNumber);
        }
    }
}

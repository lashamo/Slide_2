import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

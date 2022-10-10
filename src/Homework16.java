import java.util.Scanner;

/**
 * დაადგინეთ ორი რიცხვის უდიდესი საერთო გამყოფი.
 */

public class Homework16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = Math.min(n , m); i >= 1; i--) {
            if (n % i == 0 & m % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}

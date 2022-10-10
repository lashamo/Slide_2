import java.util.Scanner;

/**
 * შემოდის ორი მთელი რიცხვი, დაბეჭდეთ მათი უმცირესი საერთო ჯერადი
 */
public class Homework21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = input.nextInt();
        int b = input.nextInt();

        long x = Math.max(a, b);
        while (true) {
            if (x % a == 0 && x % b == 0) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}

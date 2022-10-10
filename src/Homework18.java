import java.util.Scanner;

/**
 * შემოდის ორი მთელი რიცხვი, დაბეჭდეთ რამდენი საერთოდ გამყოფი აქვთ მათ
 */
public class Homework18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two number");
        int a = input.nextInt();
        int b = input.nextInt();

        int counter = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 & b % i == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

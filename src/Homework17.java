import java.util.Scanner;

/**
 * დაბეჭდეთ ორი რიცხვის უდიდესი საერთო გამყოფი ევკლიდეს ალგორითმის გამოყენებით
 */
public class Homework17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = input.nextInt();
        int b = input.nextInt();
        int r;
        while (a % b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(b);
    }
}

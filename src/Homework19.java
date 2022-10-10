import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი, დაადგინეთ არის თუ არა რაიმეს კვადრატი
 */
public class Homework19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int a = input.nextInt();

        boolean b = false;
        for (int i = 1; i <= a; i++) {
            if (a / i == i && a % i == 0) {
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

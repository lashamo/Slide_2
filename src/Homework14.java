import java.util.Scanner;

/**
 * დაადგინეთ რამდენ ნიშნაა მოცემული მთელი რიცხვი
 */
public class Homework14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int n = input.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}

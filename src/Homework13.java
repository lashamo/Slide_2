import java.util.Scanner;

/**
 * დათვალეთ მოცემული მთელი რიცხვის ფაქტორიალი. (for ციკლის გამოყენებით)
 */
public class Homework13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int k = input.nextInt();
        int z = 1;
        for (int y = 1; y <= k; y++) {
            z *= y;
        }
        System.out.println(z);
    }
}

import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n, დაბეჭდეთ შემდეგი ფიგურა.
 * მაგალითი1
 * შემოდის
 * 3
 * პასუხი
 * *
 * **
 * ***
 * **
 * *
 * მაგალითი2
 * შემოდის
 * 4
 * პასუხი
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 */
public class Homework40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 1; k < n; k++) {
            for (int j = 1; j <= n - k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n, დაადგინეთ არის თუ არა ორის რომელიმე ხარისხი.
 * მაგალითი1:
 * შემოდის
 * 64
 * პასუხი
 * YES
 * შემოდის
 * 24
 * პასუხი
 * NO
 */
public class Homework42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean b = true;

        while (n > 2) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            if (n % 2 != 0) {
                b = false;
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

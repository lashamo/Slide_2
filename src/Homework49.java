import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n, წარმოადგინეთ ის უმცირესი რაოდენობის ორის ხარისხების ჯამით.
 * მაგალითი1:
 * შემოდის
 * 53
 * პასუხი
 * 32 16 4 1
 * მაგალითი2:
 * შემოდის
 * 14
 * პასუხი
 * 8 4 2
 * მაგალითი3:
 * შემოდის
 * 101
 * პასუხი
 * 64 32 4 1
 */
public class Homework49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 0) {
            int k = 0;
            while (Math.pow(2, k) <= n) {
                k++;
            }
            n = (int) (n - (Math.pow(2, k - 1)));

            System.out.print((int )Math.pow(2, k - 1) + " ");
        }

    }
}

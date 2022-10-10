import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი რიცხვი, დაადგინებ მათი ჯამი
 * მაგალითი1:
 * შემოდის
 * 4
 * 9 12 5 2
 * პასუხი
 * 28
 */
public class Homework32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            arr[i] = k;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}


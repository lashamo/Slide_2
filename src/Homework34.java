import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი რიცხვი, დაადგინეთ ეს რიცხვები არის თუ არა დალაგებული ზრდაოდბით
 * მაგალითი1:
 * შემოდის
 * 4
 * 3 5 8 10
 * პასუხი
 * YES
 * მაგალითი2:
 * შემოდის
 * 4
 * 3 5 8 3
 * პასუხი
 * NO
 */
public class Homework34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            arr[i] = k;
        }
        boolean b = true;

        for (int i = 0; i < n - 1; i++){
            if (arr[i] > arr[i + 1]) {
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
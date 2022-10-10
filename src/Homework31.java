/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი რიცხვი, დაადგინეთ ამ რიცხვებში ლუწი რიხვი უფრო მეტია თუ კენტი
 * მაგალითი1:
 * შემოდის
 * 4
 * 9 12 5 2
 * პასუხი
 * EQUAL
 * მაგალითი2:
 * შემოდის
 * 5
 * 3 19 2 5 12
 * პასუხი:
 * ODD
 * მაგალითი3:
 * შემოდის
 * 3
 * 10 2 1
 * პასუხი
 * EVEN
 */

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            arr[i] = k;
        }

        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                b++;
            } else {
                c++;
            }
        }

        if (b > c) {
            System.out.println("even");
        } else if (b < c) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
    }
}

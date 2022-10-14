/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ nXn-ზე რიცხვები - მხოლოდ ნოლები ან ერთები. დაბეჭდეთ ეს მატრიცა "ხატავს" თუ არა X სიმბოლოს.
 * X სიმბოლო "იხატება" მხოლოდ მაშინ როცა მატრიცის ორივე დიაგონალზე არის მხოლოდ ერთები ხოლო მატრიცის დანარჩენი ელემენტები ნოლები.
 * მაგალითი1:
 * შემოდის
 * 5
 * 1 0 0 0 1
 * 0 1 0 1 0
 * 0 0 1 0 0
 * 0 1 0 1 0
 * 1 0 0 0 1
 * პასუხი
 * YES
 * მაგალითი2:
 * შემოდის
 * 3
 * 1 0 1
 * 1 1 1
 * 1 0 0
 * პასუხი
 * NO
 */

import java.util.Scanner;

public class Homework45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                matrix[i][j] = x;
            }
        }

        // It's different solution for this task
//        int s1 = 0;
//        for (int i = 0; i < n; i++) {
//            s1 += matrix[i][i];
//        }
//        if (s1 != n) {
//            System.out.println("NO");
//            return;
//        }
//
//        int s2 = 0;
//        for (int i = 0; i < n; i++) {
//            s2 += matrix[i][n - 1 - i];
//        }
//        if (s2 != n) {
//            System.out.println("NO");
//            return;
//        }
//
//        int s3 = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                s3 += matrix[i][j];
//            }
//        }
//        if (s3 == 2 * n - 1) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


        boolean b = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    if (matrix[i][j] != 1) {
                        b = false;
                        break;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        b = false;
                        break;
                    }
                }
            }
        }
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
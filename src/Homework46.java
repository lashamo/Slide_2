import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი მთელი რიცხვი, დაადგინეთ მათ შორის ყველა ლუწი რიცხვის ერთმანეთზე ნამრავლი.
 * მაგალითი1:
 * შემოდის
 * 5
 * 3 4 2 7 4
 * პასუხი
 * 32
 * მაგალითი2:
 * შემოდის
 * 6
 * 4 3 1 2 5 10
 * პასუხი
 * 80
 */
public class Homework46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum *= arr[i];
            }
        }

        System.out.println(sum);
    }
}

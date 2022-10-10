import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი რიცხვი. შემდეგ შემოდის ისევ ერთი მთელი რიცხვი k.
 * დაადგინეთ შემოსული n ცალი რიცხვი შეიცავს თუ არა რიცხვ k-ს
 * მაგალითი1:
 * შემოდის
 * 4
 * 9 12 5 2
 * 12
 * პასუხი
 * YES
 * მაგალითი2:
 * შემოდის
 * 5
 * 3 19 0 5 12
 * 10
 * პასუხი
 * NO
 */
public class Homework30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Please enter your number");
        boolean b = false;
        int k = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                b = true;
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

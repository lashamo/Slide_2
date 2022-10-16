import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი მთელი რიცხვი, დაადგინეთ რომელი რიცხვი მეორდება
 * ყველაზე მეტჯერ(თუ რამდენიმე რიცხვი მეორდება ყველაზე მეტჯერ, დაბეჭდეთ ნებისმიერი მათგანი).
 * მაგალითი1:
 * შემოდის
 * 7
 * 3 5 3 5 5 2
 * პასუხი
 * 5
 * მაგალითი2:
 * შემოდის
 * 5
 * 2 4 8 1 2
 * პასუხი
 * 2
 */
public class Homework48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }

        int x = arr[0];
        int m = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > m) {
                m = count;
                x = arr[i];
            }
        }
        System.out.println(x + " - " + m);
    }
}

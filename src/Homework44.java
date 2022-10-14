import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n. დაბეჭდეთ 2-დან n-ის ჩათვლით ყველა მარტივი რიცხვი.
 * მაგალითი1:
 * შემოდის
 * 17
 * პასუხი
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 */
public class Homework44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            int counter = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter <= 1) {
                System.out.println(i);
            }
        }
    }
}


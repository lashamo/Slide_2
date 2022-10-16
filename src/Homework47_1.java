import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n, დაბეჭდეთ მისი შემობრუნებით მიღებული რიცხვი.
 * მაგალითი1:
 * შემოდის
 * 4263
 * პასუხი
 * 3624
 * მაგალითი2:
 * შემოდის
 * 9147
 * პასუხი
 * 7419
 */
public class Homework47_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean b = true;

        int k;
        while (n > 0) {
            k = n % 10;
            n = n / 10;
            if (k == 0 && b) {
                continue;
            } else {
                b = false;
            }
            System.out.print(k);
        }
    }
}




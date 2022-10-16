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
public class Homework47_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int m = 0;
        while (n != 0) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(m);
    }
}




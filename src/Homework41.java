import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n, დაადგინეთ რამდენჯერ შეიცავს ციფრ ნოლს.
 * მაგალითი1:
 * შემოდის
 * 504900
 * პასუხი
 * 3
 * მაგალითი2:
 * შემოდის
 * 1001
 * პასუხი
 */
public class Homework41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0;

        while (n > 9) {
            if (n % 10 == 0) {
                counter++;
            }
            n = n / 10;
        }

        System.out.println(counter);
    }
}

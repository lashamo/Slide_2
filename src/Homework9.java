import java.util.Scanner;

/**
 * მოცემულია ერთი ნამდვილი (არამთელი) რიცხვი დაამრგვალეთ მთელ რიცხვებამდე და დაბეჭდეთ
 * შედეგი (მაგ: თუ მოცემუცია 10,63 პასუხია 11 თუ მოცემულია 15,341341 მაშინ პასუხია 15)
 */

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        double q = scanner.nextDouble();
        double r = q - (int) q;

        if (r >= 0.5) {
            System.out.println((int) q + 1);
        } else {
            System.out.println((int) q);
        }
    }
}

/**
 * დათვალეთ 10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამი. (while ციკლის გამოყენებით)
 */
public class Homework12 {
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        while (i <= 100) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println(sum);
    }
}

/**
 * დაბეჭდეთ 1-დან 40-მდე ყველა კენტი რიცხვი. (for ციკლის გამოყენებით)
 */
public class homework11 {
    public static void main(String[] args) {
        for (int i = 1; i < 40; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

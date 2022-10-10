/**
 * დაბეჭდეთ 10000-დან 1-ს ჩათვლით ყველა ისეთი რიცხვი რომელიც მთავრდება 3-ზე და იყოფა 3-ზე.
 */
public class Homework20 {
    public static void main(String[] args) {
        int a = 1000;
        while (a >= 0) {
            if (a % 10 == 3 && a % 3 == 0) {
                System.out.println(a);
            }
            a--;
        }
    }
}

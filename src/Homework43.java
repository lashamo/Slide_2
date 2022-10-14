/**
 * დაბეჭდეთ ერთიდან ასის ჩათვლით ყველა ხუთის ჯერადი კენტი რიცხვი
 */
public class Homework43 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

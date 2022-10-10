import java.util.Scanner;

/**
 * დაადგინეთ მოცემული პატარა ასო არის თუ არა ხმოვანი
 */
public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write one letter of the alphabet");
        char q = scanner.next().charAt(0);
        if (q == 'a' || q == 'e' || q == 'i' || q == 'o' || q == 'u') {
            System.out.println("vowels");
        } else {
            System.out.println("not vowels");
        }
    }
}

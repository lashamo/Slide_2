import java.util.Scanner;

/**
 * მოცემულია ერთი მთელი რიცხვი, დაადგინეთ,არის თუ არა სამნიშნა
 */
public class Homework5 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();
        if (number >= 100 && number <= 999) {
            System.out.println("This number is three digits");
        } else {
            System.out.println("This number is not three digits");
        }
    }
}

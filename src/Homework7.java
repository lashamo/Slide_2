import java.util.Scanner;

/**
 * მცემულია სამი მთელი რიცხვი,დაადგინეთ შესაძლებელია თუ არა სამკუთხედის შექმნა რომლის გვერდების სიგრძე
 * იქნება ეს რიცხვები(შეგახსენებთ რომ იმისთვის რომ სამკუთხედი შეიქმნას აუცილებელია და საკმარისი მისი
 * ყოველი გვერდი უნდა იყოს ნაკლები დანარჩენი ორი გვერდის ჯამზე)
 */

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter three number");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber < secondNumber + thirdNumber && secondNumber < firstNumber + thirdNumber &&
        thirdNumber < firstNumber + secondNumber) {
            System.out.println("Can be created");
        } else {
            System.out.println("Can't be created");
        }
    }

}

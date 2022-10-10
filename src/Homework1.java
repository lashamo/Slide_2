/**
 * იპოვეთ და დაბეჭდეთ მოცემული სამნიშნა რიცხვის ციფრთა ჯამი (მაგ.: თუ მოცემული გვაქვს 539 პასუხი იქნება 17).
 */

public class Homework1 {

    public static void main(String[] args) {
        int x = 536;
        int firstDigit = x / 100;
//        int secondDigit = (x - (firstDigit * 100)) / 10;
        int secondDigit = x / 10 % 10;
        int thirdDigit = x % 10;
        System.out.println("Result is :  " + (firstDigit + secondDigit + thirdDigit));
    }

}

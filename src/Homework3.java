/**
 * იპოვეთ და დაბეჭდეთ მოცემული არამთელი (ნამდვილი) რიცხვის არამთელი ნაწილი (მაგ.:თუ მოცემულია 10.391 პასუხია 0.391).
 */

public class Homework3 {
    public static void main(String[] args) {
        double r = 15.391;
//        double q = r % 10;
        double q = r - (int) r;
        System.out.println(q);
    }
}

/**
 * დაადგინეთ და დაბეჭდეთ რა რიცხვი მიიღება ორნიშნა რიცხვის შემოტრიალებით (მაგ.: თუ მოცემული არის რიცხვი 37 პასუხი იქნება 73).
 */

public class Homework2 {
    public static void main(String[] args) {
        int b = 37;
        int k = b / 10;
        int l = b % 10;
        int reversed = l * 10 + k;
        System.out.println("Reversed: " + reversed);
    }
}

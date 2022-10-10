import java.util.Scanner;

/**
 * დაადგინეთ რიცხვი არის თუ არა მარტივი
 */
public class Homework15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int k = input.nextInt();
        // Solve 1
        int counter = 0 ;
        for (int i= 1; i<=k; i++){
            if (k % i == 0){
                counter++;
            }

        }
        if (counter<=2){
            System.out.println("martivi");
        }else {
            System.out.println("shed");
        }

        // Solve 2
        boolean b = false;
        for (int i = 2; i <= k - 1; i++) {
            if (k % i == 0) {
                b = true;
                break;
            }
        }
        if (b == true) {
            System.out.println("Shedgenilia");
        } else {
            System.out.println("Martivia");
        }

    }
}

import java.util.Scanner;

public class CountTwoDigitNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            arr[i] = x;
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 9 && arr[i] < 99) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

import java.util.Scanner;

public class Homework22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int k = input.nextInt();
            arr[i] = k;
        }

        int b = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                b++;

            } else if (arr[i]%2 !=0) {
                c++;

            }

        }

        if (b>c){
            System.out.println("even");
        } else if (b<c) {
            System.out.println("odd");

        }else {
            System.out.println("equal");
        }
    }
}

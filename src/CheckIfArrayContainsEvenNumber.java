import java.util.Scanner;

public class CheckIfArrayContainsEvenNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            int k = input.nextInt();
            arr[i] = k ;
        }

        boolean b = false;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

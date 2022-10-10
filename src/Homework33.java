import java.util.Scanner;

/**
 * შემოდის ერთი მთელი რიცხვი n და შემდეგ n ცალი რიცხვი, დაადგინეთ რომელია მათ შორის უმცირესი
 * მაგალითი1:
 * შემოდის
 * 5
 * 9 12 5 2 3
 * პასუხი
 * 2
 */
public class Homework33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            int k = input.nextInt();
            arr[i]=k;
        }
        int min = arr[0];
        for (int i = 1; i<n; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

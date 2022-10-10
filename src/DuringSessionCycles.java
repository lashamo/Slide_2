import java.util.Scanner;

public class DuringSessionCycles {

    public static void main(String[] args) {

        // ********************************
        int p = 100;
        while (p >= 0) {
            if (p % 2 == 0) {
                System.out.print(p + " ");
            }
            p--;
        }
        System.out.println();
        // ********************************



        // ********************************
        int x = 1;
        do {
            System.out.println(x);
        } while (x == 2);
        // ********************************




        // ********************************
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        int j = 1;
        while (j <= n) {
            s = s + j;
            j++;
        }
        System.out.println(s);
        // ********************************



        // ********************************
        n = scanner.nextInt();
        // n = 648   18
        s = 0;
        while (n != 0){
            s = s + (n % 10);
            n = n / 10;
        }
        System.out.println(s);
        // ********************************



        // ********************************
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // ********************************



        // ********************************
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 27) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // ********************************


        // 77 - 98
    }
}

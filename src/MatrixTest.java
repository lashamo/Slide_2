import java.util.Scanner;

public class MatrixTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                matrix[i][j] = x;
//                matrix[i][j] = scanner.nextInt();
            }
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            s += matrix[i][i];
        }
        System.out.println(s);

        int s2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s2 += matrix[i][j];
            }
        }
        System.out.println(s2);
    }
}

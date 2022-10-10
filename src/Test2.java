public class Test2 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][3];
        matrix[1][1] = 2;
        matrix[3][0] = 7;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

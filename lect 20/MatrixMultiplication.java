public class MatrixMultiplication {
    public static void main(String[] args) {
        // Example matrices
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Dimensions
        int m = A.length;        // rows in A
        int n = A[0].length;     // cols in A
        int p = B[0].length;     // cols in B

        // Check if multiplication is possible
        if (A[0].length != B.length) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        // Result matrix
        int[][] C = new int[m][p];

        // Multiplication logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

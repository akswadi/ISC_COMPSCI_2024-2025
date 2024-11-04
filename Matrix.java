import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        
        if (m <= 2 || m >= 20 || n <= 2 || n >= 20) {
            System.out.println("Error: m and n must be greater than 2 and less than 20.");
            System.exit(0);
        }
        
        int[][] A = new int[m][n];
        
        System.out.println("Enter the elements of the matrix (positive integers):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Collecting and sorting boundary elements
        int[] boundaryElements = new int[2 * m + 2 * n - 4];
        int index = 0;

        // Top row, right column, bottom row, left column
        for (int j = 0; j < n; j++) {
            boundaryElements[index++] = A[0][j]; // Top row
        }
        for (int i = 1; i < m - 1; i++) {
            boundaryElements[index++] = A[i][n - 1]; // Right column
        }
        for (int j = n - 1; j >= 0; j--) {
            boundaryElements[index++] = A[m - 1][j]; // Bottom row
        }
        for (int i = m - 2; i > 0; i--) {
            boundaryElements[index++] = A[i][0]; // Left column
        }

        // Sorting boundary elements using bubble sort
        for (int i = 0; i < boundaryElements.length - 1; i++) {
            for (int j = 0; j < boundaryElements.length - 1 - i; j++) {
                if (boundaryElements[j] > boundaryElements[j + 1]) {
                    int temp = boundaryElements[j];
                    boundaryElements[j] = boundaryElements[j + 1];
                    boundaryElements[j + 1] = temp;
                }
            }
        }

        // Rearranging boundary elements back into the matrix
        index = 0;

        // Top row, right column, bottom row, left column
        for (int j = 0; j < n; j++) {
            A[0][j] = boundaryElements[index++]; // Top row
        }
        for (int i = 1; i < m - 1; i++) {
            A[i][n - 1] = boundaryElements[index++]; // Right column
        }
        for (int j = n - 1; j >= 0; j--) {
            A[m - 1][j] = boundaryElements[index++]; // Bottom row
        }
        for (int i = m - 2; i > 0; i--) {
            A[i][0] = boundaryElements[index++]; // Left column
        }

        System.out.println("REARRANGED MATRIX");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("BOUNDARY ELEMENTS");
        // Print boundary elements
        for (int j = 0; j < n; j++) {
            System.out.print(A[0][j] + " "); // Top row
        }
        System.out.print("\n");
        for (int i = 1; i < m - 1; i++) {
            System.out.print(A[i][n - 1] + " "); // Right column
        }
        System.out.print("\n");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(A[m - 1][j] + " "); // Bottom row
        }
        System.out.print("\n");
        for (int i = m - 2; i > 0; i--) {
            System.out.print(A[i][0] + " "); // Left column
        }
        System.out.print("\n");

        // Calculate the sum of boundary elements
        int sum = 0;
        for (int b : boundaryElements) {
            sum += b;
        }

        System.out.println("SUM OF THE OUTER ROW AND COLUMN ELEMENTS = " + sum);
    }
}
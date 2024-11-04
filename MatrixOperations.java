import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the order of the matrix (N): ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 20) {
            System.out.println("Error: Please enter a value for N between 1 and 20.");
            System.exit(0);
        }
        
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int largest = 0; // Initialize to 0, assuming positive integers
        int secondLargest = 0; // Initialize to 0
        int largestRow = -1, largestCol = -1;
        int secondLargestRow = -1, secondLargestCol = -1;

        // Find largest and second largest elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > largest) {
                    secondLargest = largest;
                    secondLargestRow = largestRow;
                    secondLargestCol = largestCol;

                    largest = matrix[i][j];
                    largestRow = i + 1; // Convert to 1-based index
                    largestCol = j + 1; // Convert to 1-based index
                } else if (matrix[i][j] > secondLargest && matrix[i][j] != largest) {
                    secondLargest = matrix[i][j];
                    secondLargestRow = i + 1; // Convert to 1-based index
                    secondLargestCol = j + 1; // Convert to 1-based index
                }
            }
        }

        System.out.println("The largest element " + largest + " is in row " + largestRow + " and column " + largestCol);
        System.out.println("The second largest element " + secondLargest + " is in row " + secondLargestRow + " and column " + secondLargestCol);

        // Sort each row in ascending order
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }

        System.out.println("\nSorted list:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

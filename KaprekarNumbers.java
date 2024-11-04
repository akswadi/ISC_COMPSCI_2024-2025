import java.util.Scanner;

public class KaprekarNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the range values p and q
        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();
        
        // Validate inputs
        if (p < 1 || q < 1 || p >= q) {
            System.out.println("Invalid input! Ensure that p < q and both are positive.");
            System.exit(0);
        }

        System.out.println("THE KAPREKAR NUMBERS ARE:");
        int frequency = 0;

        for (int i = p; i <= q; i++) {
            long square = (long) i * i;
            int d = countDigits(i);
            long divisor = (long) Math.pow(10, d); // Divisor to separate right and left parts
            
            long rightPart = square % divisor;
            long leftPart = square / divisor;

            // Check if it is a Kaprekar number
            if (rightPart + leftPart == i) {
                System.out.print(i + " ");
                frequency++;
            }
        }

        // Print the frequency of Kaprekar numbers
        System.out.println("\nFREQUENCY OF KAPREKAR NUMBERS IS: " + frequency);
    }

    // Helper function to count the number of digits in an integer
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}

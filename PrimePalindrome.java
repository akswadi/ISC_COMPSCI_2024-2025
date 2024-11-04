import java.util.Scanner;
public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input values for m and n
        System.out.println("Enter the values for m and n (where m < n):");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Check if m and n are within the valid range
        if (m < 1 || m >= 3000 || n < 1 || n >= 3000 || m >= n) {
            System.out.println("Out of Range");
        } else {
            System.out.println("The prime palindrome integers are:");
            int count = 0;

            // Iterate through the range from m to n
            for (int i = m; i <= n; i++) {
                // Check if the number is prime
                int isPrime = 1;
                if (i < 2) {
                    isPrime = 0;
                }
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }

                // Check if the number is a palindrome
                int original = i;
                int reversed = 0;
                while (original > 0) {
                    int digit = original % 10;
                    reversed = reversed * 10 + digit;
                    original /= 10;
                }

                // If both conditions are satisfied, print the number
                if (isPrime == 1 && i == reversed) {
                    System.out.print(i + (count < 1 ? "" : ","));
                    count++;
                }
            }

            // Print the frequency of prime palindrome integers
            System.out.println();
            System.out.println("Frequency of prime palindrome integers: " + count);
        }
    }
}

import java.util.Scanner;
public class BankDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount (up to 5 digits):");
        int amount = sc.nextInt();

        // Check if amount is within valid range
        if (amount > 99999 || amount < 1) {
            System.out.println("INVALID AMOUNT");
            System.exit(0);
        }

        // Convert amount to words
        String amountStr = Integer.toString(amount);
        String[] words = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        System.out.print("OUTPUT: ");
        for (int i = 0; i < amountStr.length(); i++) {
            System.out.print(words[amountStr.charAt(i) - '0'] + " ");
        }
        System.out.println();

        // Denominations available
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("DENOMINATION:");

        int totalNotes = 0;
        // Calculate and display each denomination used
        for (int i = 0; i < denominations.length; i++) {
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + " X " + count + " = " + (denominations[i] * count));
                amount -= denominations[i] * count;
                totalNotes += count;
            }
        }
        System.out.println("Total number of notes: " + totalNotes);
    }
}

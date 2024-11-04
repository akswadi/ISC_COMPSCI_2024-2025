import java.util.Scanner;
public class QUESTION_19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input sentence
        System.out.println("Enter a sentence ending with a full stop:");
        String input = sc.nextLine().trim();

        // Check if the sentence ends with a full stop
        if (input.charAt(input.length() - 1) != '.') {
            System.out.println("Invalid sentence. Must end with a full stop.");
            return;
        }

        // Remove the full stop for processing
        input = input.substring(0, input.length() - 1).trim();

        // Split the sentence into words
        String[] words = input.split(" ");
        int length = words.length;

        // Sort the words by length using bubble sort
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Output the sorted words with the first letter capitalized
        System.out.print("Output: ");
        System.out.print(Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1)); // Capitalize the first word
        for (int i = 1; i < length; i++) {
            System.out.print(" " + words[i]); // Print remaining words
        }
        System.out.println("."); // End the output with a full stop
    }
}

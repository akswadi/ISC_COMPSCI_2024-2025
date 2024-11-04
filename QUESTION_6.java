import java.util.Scanner;
public class QUESTION_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence (ending with a full stop):");
        String sentence = sc.nextLine().trim();
        if (!sentence.endsWith(".")) {
            System.out.println("Invalid input! The sentence must end with a full stop.");
            System.exit(0);
        }

        // Remove the period and split the sentence into words
        String[] words = sentence.substring(0, sentence.length() - 1).toLowerCase().split(" ");

        // Sort the words by length, maintaining order for equal-length words
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Capitalize the first letter of the first word in the output sentence
        String result = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);

        // Concatenate remaining words
        for (int i = 1; i < words.length; i++) {
            result += " " + words[i];
        }
        // Append the period at the end
        result += ".";

        System.out.println("Sorted sentence:");
        System.out.println(result);
    }
}

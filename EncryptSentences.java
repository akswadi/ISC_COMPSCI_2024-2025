import java.util.Scanner;

public class EncryptSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array (greater than 1 and less than 10): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        if (n <= 1 || n >= 10) {
            System.out.println("Size must be greater than 1 and less than 10.");
            return;
        }

        String[] sentences = new String[n];

        System.out.println("Enter " + n + " sentences, each ending with a full stop:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String sentence = sentences[i];
            String result = "";

            if (i % 2 == 0) { // Odd rows (0-indexed)
                for (int j = 0; j < sentence.length(); j++) {
                    char c = sentence.charAt(j);
                    if (c >= 'a' && c <= 'z') {
                        c = (char)((c - 'a' + 2) % 26 + 'a');
                    } else if (c >= 'A' && c <= 'Z') {
                        c = (char)((c - 'A' + 2) % 26 + 'A');
                    }
                    result += c;
                }
            } else { // Even rows (0-indexed)
                String[] words = sentence.split(" ");
                for (int j = words.length - 1; j >= 0; j--) {
                    result += words[j];
                    if (j > 0) {
                        result += " ";
                    }
                }
            }

            sentences[i] = result;
        }

        System.out.println("Encrypted sentences:");
        for (String sentence : sentences) {
            System.out.println(sentence + ".");
        }
    }
}

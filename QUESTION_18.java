import java.util.Scanner;
public class QUESTION_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();  // Consume the newline after the integer input
        String[] l = new String[n];

        // Read input lines
        for (int i = 0; i < n; i++) {
            l[i] = s.nextLine();
        }

        String txt = ""; // To store all text without punctuation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l[i].length(); j++) {
                char c = l[i].charAt(j);
                // Check if the character is a letter or a space
                if (Character.isLetter(c) || c == ' ') {
                    txt += c; // Append valid characters
                }
            }
        }

        // Split the text into words
        String[] w = txt.split(" ");
        String out = "";

        // Reverse the order of the words
        for (int i = w.length - 1; i >= 0; i--) {
            out += w[i] + " ";
        }

        // Print the output without trailing space
        System.out.println(out.trim());
    }
}

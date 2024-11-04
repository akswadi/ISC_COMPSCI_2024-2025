import java.util.Scanner;

public class SentenceProc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String s = sc.nextLine().trim();
        
        // Check for termination
        char lc = s.charAt(s.length() - 1);
        if (lc != '.' && lc != '!' && lc != '?') {
            System.out.println("Invalid sentence. Must end with '.', '!', or '?'.");
            return;
        }

        // Remove the punctuation for processing
        s = s.substring(0, s.length() - 1);
        
        // Split the sentence into words
        String[] w = s.split(" ");
        int len = w.length;

        // Sort words alphabetically
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (w[i].compareTo(w[j]) > 0) {
                    // Swap
                    String temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }

        // Output the results
        System.out.println("Length: " + len);
        System.out.print("Rearranged Sentence: ");
        for (int i = 0; i < len; i++) {
            System.out.print(w[i]);
            if (i < len - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

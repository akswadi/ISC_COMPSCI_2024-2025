import java.util.Scanner;

public class Sentence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of sentences (1 to 4):");
        int n = sc.nextInt();
        if (n < 1 || n > 4) {
            System.out.println("Invalid number of sentences!");
            System.exit(0);
        }

        System.out.println("Enter the paragraph:");
        String p = sc.nextLine();

        int wc = 0; // Word count
        String w = ""; // Current word
        int f[] = new int[100]; // Frequencies
        String arr[] = new String[100]; // Words
        int uwc = 0; // Unique word count

        // Process each character in the paragraph
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);

            if (c == ' ' || c == '.' || c == '?') {
                if (!w.isEmpty()) {
                    boolean found = false;
                    for (int j = 0; j < uwc; j++) {
                        if (arr[j].equals(w)) {
                            f[j]++;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        arr[uwc] = w;
                        f[uwc] = 1;
                        uwc++;
                    }
                    wc++;
                    w = ""; // Reset word for next input
                }
            } else {
                w += c; // Build the current word
            }
        }

        // Check for any remaining word at the end of the paragraph
        if (!w.isEmpty()) {
            boolean found = false;
            for (int j = 0; j < uwc; j++) {
                if (arr[j].equals(w)) {
                    f[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                arr[uwc] = w;
                f[uwc] = 1;
                uwc++;
            }
            wc++;
        }

        System.out.println("Number of Words in the paragraph=" + wc);
        System.out.println("WORD FREQUENCY");

        // Sort and display the word frequency
        for (int i = 0; i < uwc; i++) {
            for (int j = i + 1; j < uwc; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    // Swap words
                    String tempW = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempW;

                    // Swap frequencies
                    int tempF = f[i];
                    f[i] = f[j];
                    f[j] = tempF;
                }
            }
        }

        for (int i = 0; i < uwc; i++) {
            System.out.println(arr[i] + " " + f[i]);
        }
    }
}

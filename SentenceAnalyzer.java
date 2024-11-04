import java.util.Scanner;
public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto 10 sentences");
        String input = sc.nextLine();
        String[] sentences = input.split("(?<=[.!?])\\s");
        System.out.printf("%-10s %-15s %-10s%n", "Sentence", "No. of Vowels", "No. of Words");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < sentences.length && i < 10; i++) {
            String sentence = sentences[i].trim();
            int wordCount = sentence.split("\\s+").length;
            int vowelCount = 0;
            for (int j = 0; j < sentence.length(); j++) {
                char ch = sentence.charAt(j);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
            System.out.printf("%-10d %-15d %-10d%n", i + 1, vowelCount, wordCount);
        }
    }
}

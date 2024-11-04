import java.util.Scanner;
public class QUESTION_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto 10 sentences");
        String input = sc.nextLine();
        String[] sentences = input.split("(?<=[.!?])\\s");
        System.out.println("Sentence\t\tNo. of Vowels\t\tNo. of Words");
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
            System.out.print(i + 1+"\t\t"+vowelCount+"\t\t"+wordCount);
        }
    }
}

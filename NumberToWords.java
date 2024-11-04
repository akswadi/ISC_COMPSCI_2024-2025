import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number (less than 1000):");
        int num = sc.nextInt();

        if (num < 1 || num >= 1000) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }

        String words = "";
        String[] units = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", 
                          "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", 
                          "EIGHTEEN", "NINETEEN"};
        String[] tens = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

        if (num >= 100) {
            words += units[num / 100] + " HUNDRED";
            num %= 100;
            if (num > 0) {
                words += " AND ";
            }
        }
        if (num >= 20) {
            words += tens[num / 10];
            num %= 10;
            if (num > 0) {
                words += " ";
            }
        }
        if (num > 0) {
            words += units[num];
        }

        System.out.println(words.trim());
    }
}

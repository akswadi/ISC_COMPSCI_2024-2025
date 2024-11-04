import java.util.Scanner;
public class SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Smith number: ");
        int n = sc.nextInt();
        int originalSum = 0;
        int temp = n;
        while (temp > 0) {
            originalSum += temp % 10;
            temp /= 10;
        }
        int divisor = 2;
        int factorsSum = 0;
        int isComposite = 0;
        while (n > 1) {
            while (n % divisor == 0) {
                isComposite++;
                int factor = divisor;
                while (factor > 0) {
                    factorsSum += factor % 10;
                    factor /= 10;
                }
                n /= divisor;
            }
            divisor++;
        }
        if (isComposite > 1 && originalSum == factorsSum) {
            System.out.println("SMITH number.");
        } else {
            System.out.println("It is NOT a Smith number.");
        }
    }
}

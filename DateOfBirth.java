import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your date of birth in dd mm yyyy format");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int[] monthDays = {31, (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int isValid = 1;

        if (year < 1000 || year > 9999) {
            isValid = 0;
        } else if (month < 1 || month > 12) {
            isValid = 0;
        } else if (day < 1 || day > monthDays[month - 1]) {
            isValid = 0;
        }

        if (isValid == 0) {
            System.out.println("INVALID DATE");
        } else {
            System.out.println("VALID DATE");
            int dayNumber = 0;

            for (int i = 0; i < month - 1; i++) {
                dayNumber += monthDays[i];
            }
            dayNumber += day;

            System.out.println(dayNumber);
        }
    }
}

import java.util.Scanner;
public class DayNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, year, N;
        System.out.println("Enter the year:");
        year = sc.nextInt();

        // Input day number
        System.out.println("Enter the day number:");
        day = sc.nextInt();

        // Input days after
        System.out.println("Enter the number of days after:");
        N = sc.nextInt();

        int[] month_size = {31, (year % 100 == 0) ? (year % 400 == 0) ? 29 : 28 : (year % 4 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Find current date
        int i = 0;
        String month = months[0];
        int dayCopy = day;
        while (dayCopy > month_size[i]) {
            month = months[i + 1];
            dayCopy -= month_size[i];
            i++;
        }

        String suffix = (dayCopy >= 4 && dayCopy <= 20) ? "Th " :
                        (dayCopy % 10 == 1) ? "St " :
                        (dayCopy % 10 == 2) ? "Nd " :
                        (dayCopy % 10 == 3) ? "Rd " : "Th ";
        String formattedDate = dayCopy + suffix + "of " + month + ", " + year;

        // Calculate future date
        int daysToAdd = N;
        while (daysToAdd >= ((year % 100 == 0) ? (year % 400 == 0) ? 366 : 365 : (year % 4 == 0) ? 366 : 365)) {
            daysToAdd -= ((year % 100 == 0) ? (year % 400 == 0) ? 366 : 365 : (year % 4 == 0) ? 366 : 365);
            year++;
        }

        int newDay = day + daysToAdd;
        i = 0;
        month = months[0];
        while (newDay > month_size[i]) {
            month = months[i + 1];
            newDay -= month_size[i];
            i++;
        }

        suffix = (newDay >= 4 && newDay <= 20) ? "Th " :
                 (newDay % 10 == 1) ? "St " :
                 (newDay % 10 == 2) ? "Nd " :
                 (newDay % 10 == 3) ? "Rd " : "Th ";
        String futureDate = newDay + suffix + "of " + month + ", " + year;

        System.out.println("The required date is: " + formattedDate);
        System.out.println("and after " + N + " days it will be: " + futureDate);
    }
}

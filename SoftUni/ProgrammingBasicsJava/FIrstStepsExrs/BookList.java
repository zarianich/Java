package FIrstStepsExrs;

import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = pagesInBook / pagesPerHour / daysToRead;

        System.out.println(hoursPerDay);
    }
}

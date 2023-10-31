package ArraysLab;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(scanner.nextLine());
        if (day>0&&day<=days.length)
            System.out.println(days[day-1]);
        else
            System.out.println("Invalid day!");
    }
}

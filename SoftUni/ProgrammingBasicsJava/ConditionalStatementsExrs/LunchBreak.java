package ConditionalStatementsExrs;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int lunchBreakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = lunchBreakDuration / 8.0;
        double breakDuration = lunchBreakDuration / 4.0;

        double difference = lunchBreakDuration - lunchDuration - breakDuration;

        if (episodeDuration <= difference)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(difference - episodeDuration));
        else System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(episodeDuration - difference));
    }
}

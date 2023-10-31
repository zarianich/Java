package ConditionalStatementsExrs;

import java.util.Scanner;

public class SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double mps_Ivan = Double.parseDouble(scanner.nextLine());

        double secondsNeeded = distance * mps_Ivan;
        double addedSeconds = Math.floor(distance/15) * 12.5;

        double totalSeconds = secondsNeeded + addedSeconds;

        if (totalSeconds < worldRecord)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds);
        else System.out.printf("No, he failed! He was %.2f seconds slower.", totalSeconds - worldRecord);
    }
}

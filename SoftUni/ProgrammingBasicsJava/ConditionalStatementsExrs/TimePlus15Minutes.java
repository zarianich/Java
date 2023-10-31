package ConditionalStatementsExrs;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int addedMinutes = hours * 60 + minutes;

        addedMinutes += 15;

        int totalHours = addedMinutes / 60;
        int totalMinutes = addedMinutes % 60;

        if (totalHours == 24)
            totalHours = 0;
        System.out.printf("%d:%02d", totalHours, totalMinutes);
    }
}

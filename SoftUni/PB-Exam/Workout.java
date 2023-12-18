import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        double kmRanOnFirstDay = Double.parseDouble(scanner.nextLine());
        double totalKmRan = kmRanOnFirstDay;
        double kmRanToday = kmRanOnFirstDay;

        for (int i = 0; i < daysCount; i++) {
            int percentIncrease = Integer.parseInt(scanner.nextLine());
            kmRanToday += kmRanToday*percentIncrease/100;
            totalKmRan += kmRanToday;
        }

        if (totalKmRan>=1000)
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKmRan - 1000));
        else System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000-totalKmRan));
    }
}

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        int busPassesCount = Integer.parseInt(scanner.nextLine());
        int museumTicketsCount = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = 0;

        moneyNeeded+= nightsCount*20*peopleCount;
        moneyNeeded+= busPassesCount*1.6*peopleCount;
        moneyNeeded+= museumTicketsCount*6*peopleCount;
        moneyNeeded*=1.25;

        System.out.printf("%.2f", moneyNeeded);
    }
}

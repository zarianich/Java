package PB_10;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = initialPoints;
        int victories = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String status = scanner.nextLine();
            switch (status){
                case "W":
                    finalPoints+=2000;
                    victories++;
                    break;
                case "F":
                    finalPoints+=1200;
                    break;
                case "SF":
                    finalPoints+=720;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((finalPoints-initialPoints)*1.0/tournamentsCount));
        System.out.printf("%.2f%%", victories*1.0/tournamentsCount*100);
    }
}

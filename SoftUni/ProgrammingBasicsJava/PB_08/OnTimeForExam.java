package PB_08;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHours * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHours * 60 + arrivalMinutes;

        if (examTotalMinutes == arrivalTotalMinutes)
            System.out.println("On time");
        else if (examTotalMinutes > arrivalTotalMinutes) {
            int diff = examTotalMinutes - arrivalTotalMinutes;
            if (diff <= 30)
                System.out.printf("On time%n%d minutes before the start", diff);
            else if (diff < 60)
                System.out.printf("Early%n%d minutes before the start", diff);
            else
                System.out.printf("Early%n%d:%02d hours before the start", diff /60, diff%60);
        } else {
            int diff = arrivalTotalMinutes - examTotalMinutes;
            if (diff > 59)
                System.out.printf("Late%n%d:%02d hours after the start", diff/60, diff%60);
            else System.out.printf("Late%n%d minutes after the start", diff);
        }
    }
}

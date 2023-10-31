package PB_14;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judgesCount = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;
        int presentaionsCounter = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")){

            double totalGradesForPresentation = 0;
            for (int i = 0; i < judgesCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGradesForPresentation+=grade;
            }
            System.out.printf("%s - %.2f.%n", input, totalGradesForPresentation/judgesCount);
            totalGrades+=totalGradesForPresentation/judgesCount;
            presentaionsCounter++;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalGrades/presentaionsCounter);
    }
}

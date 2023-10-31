package PB_11;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int gradeCount = 1;
        int failsCount = 0;
        double allGrades = 0;

        while (gradeCount < 13){
            double grade = Double.parseDouble(scanner.nextLine());
            allGrades+=grade;
            if (grade < 4.0){
                failsCount++;
            }
            if (failsCount >= 1) {
                System.out.printf("%s has been excluded at %d grade", name, gradeCount);
                break;
            }
            if (gradeCount == 12)
                System.out.printf("%s graduated. Average grade: %.2f", name, allGrades/12.0);
            gradeCount++;
        }
    }
}

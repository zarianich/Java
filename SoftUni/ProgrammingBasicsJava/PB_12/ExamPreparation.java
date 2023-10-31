package PB_12;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        int mark = 0;
        int allMarks = 0;
        int problemCounter = 0;
        String lastProblem = "";
        int badGradesCounter = 0;

        while (!input.equals("Enough")){
            input = scanner.nextLine();
            if (input.equals("Enough"))
                break;
            mark = Integer.parseInt(scanner.nextLine());
            problemCounter++;
            allMarks+=mark;
            lastProblem = input;
            if (mark <= 4)
                badGradesCounter++;
            if (badGradesCounter == n)
                break;
        }

        if (badGradesCounter == n)
            System.out.printf("You need a break, %d poor grades.", badGradesCounter);
        else
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", allMarks*1.0/problemCounter, problemCounter, lastProblem);
    }
}

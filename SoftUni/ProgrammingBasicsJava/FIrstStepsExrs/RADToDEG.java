package FIrstStepsExrs;

import java.util.Scanner;

public class RADToDEG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double angleInRAD = Double.parseDouble(scanner.nextLine());
        double angleInDEG = angleInRAD * 180/Math.PI;

        System.out.println(angleInDEG);
    }
}

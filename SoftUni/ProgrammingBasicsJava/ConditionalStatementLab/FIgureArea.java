package ConditionalStatementLab;

import java.util.Scanner;

public class FIgureArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side*side);
        } else if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side1*side2);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", Math.PI*radius*radius);
        } else if (figure.equals("triangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", side1*side2/2.0);
        }
    }
}

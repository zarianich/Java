package PB_10;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabsCount = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < tabsCount; i++) {
            String text = scanner.nextLine();
            switch (text){
                case "Facebook":
                    salary-=150;
                    break;
                case "Instagram":
                    salary-=100;
                    break;
                case "Reddit":
                    salary-=50;
                    break;
                default:
                    break;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0)
            System.out.printf("%.0f", salary);
    }
}

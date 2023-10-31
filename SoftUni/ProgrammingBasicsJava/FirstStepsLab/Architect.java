package FirstStepsLab;

import java.util.Scanner;

public class Architect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = projectCount * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursNeeded, projectCount);
    }
}

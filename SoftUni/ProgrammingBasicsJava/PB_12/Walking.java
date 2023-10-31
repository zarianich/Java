package PB_12;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000){
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                int n = Integer.parseInt(scanner.nextLine());
                totalSteps+=n;
                break;
            }else {
                int n = Integer.parseInt(input);
                totalSteps+=n;
            }
        }
        if (totalSteps < 10000)
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        else System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - 10000);
    }
}

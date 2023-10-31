package ArraysExer;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        int [] lift = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int i = 0; i < lift.length; i++) {
            while (lift[i]<4&&peopleInQueue>0){
                peopleInQueue--;
                lift[i]++;
            }
        }

        if (peopleInQueue>0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
            for (int wagon:lift
                 ) {
                System.out.printf("%d ", wagon);
            }
        }else {
            boolean hasEmptySeats = false;
            for (int wagon:lift
                 ) {
                if (wagon<4)
                    hasEmptySeats=true;
            }
            if (hasEmptySeats){
                System.out.println("The lift has empty spots!");
                for (int wagon:lift
                ) {
                    System.out.printf("%d ", wagon);
                }
            }else {
                for (int wagon:lift
                ) {
                    System.out.printf("%d ", wagon);
                }
            }
        }
    }
}

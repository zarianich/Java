package ListsExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] tokens = command.split(" ");
            if (command.contains("Add")){
                wagons.add(Integer.parseInt(tokens[1]));
            } else {
                int peopleToFit = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (capacity - wagons.get(i) >= peopleToFit) {
                        wagons.set(i, wagons.get(i) + peopleToFit);
                        i = wagons.size();
                    }
                }
            }

            command = scanner.nextLine();
        }

        printTrain(wagons);
    }

    public static void printTrain(List<Integer> wagons){

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));

    }
}

package ListsExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] tokens = command.split(" ");

            if (command.contains("Delete")){
                nums.removeAll(Arrays.asList(Integer.parseInt(tokens[1])));
            } else if (command.contains("Insert")) {
                nums.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
            }

            command = scanner.nextLine();
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}

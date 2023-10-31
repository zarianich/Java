package ListsExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] tokens = command.split(" ");

            if (command.contains("Add")){
                nums.add(Integer.valueOf(Integer.parseInt(tokens[1])));
            } else if (command.contains("Remove")) {
                if (Integer.parseInt(tokens[1])<nums.size()&&Integer.parseInt(tokens[1])>=0)
                    nums.remove(Integer.parseInt(tokens[1]));
                else System.out.println("Invalid index");
            } else if (command.contains("Insert")) {
                if (Integer.parseInt(tokens[2])<nums.size()&&Integer.parseInt(tokens[2])>=0)
                    nums.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
                else System.out.println("Invalid index");
            } else if (command.contains("Shift left")) {
                int shiftTimes = Integer.parseInt(tokens[2]);
                for (int i = 0; i < shiftTimes; i++) {
                    int temp = nums.get(0);
                    nums.remove(0);
                    nums.add(Integer.valueOf(temp));
                }
            } else if (command.contains("Shift right")) {
                int shiftTimes = Integer.parseInt(tokens[2]);
                for (int i = 0; i < shiftTimes; i++) {
                    int temp = nums.get(nums.size() - 1);
                    nums.remove(nums.size() - 1);
                    nums.add(0, temp);
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}

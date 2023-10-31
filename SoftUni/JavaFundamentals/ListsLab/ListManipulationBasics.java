package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandSplit = command.split(" ");
            if (commandSplit[0].equals("Add")){
                nums.add(Integer.parseInt(commandSplit[1]));
            } else if (commandSplit[0].equals("Remove")) {
                nums.remove(Integer.valueOf(Integer.parseInt(commandSplit[1])));
            } else if (commandSplit[0].equals("RemoveAt")) {
                nums.remove(Integer.parseInt(commandSplit[1]));
            } else if (commandSplit[0].equals("Insert")) {
                nums.add(Integer.parseInt(commandSplit[2]), Integer.parseInt(commandSplit[1]));
            }

            command = scanner.nextLine();
        }

        System.out.println(listToString(nums));
    }

    public static String listToString(List<Integer> list){
        String output = "";

        for (int element:list
        ) {
            output+= element + " ";
        }

        return output;
    }
}

package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandSplit = command.split(" ");
            if (commandSplit[0].equals("Contains")){
                if (nums.contains(Integer.parseInt(commandSplit[1]))){
                    System.out.println("Yes");
                }else System.out.println("No such number");
            } else if (commandSplit[0].equals("Print") && commandSplit[1].equals("even")) {
                for (int num:nums
                     ) {
                    if (num%2==0)
                        System.out.printf("%d ", num);
                }
                System.out.printf("%n");
            } else if (commandSplit[0].equals("Print") && commandSplit[1].equals("odd")) {
                for (int num:nums
                ) {
                    if (!(num%2==0))
                        System.out.printf("%d ", num);
                }
                System.out.printf("%n");
            } else if (commandSplit[0].equals("Get") && commandSplit[1].equals("sum")) {
                int sum = 0;
                for (int num:nums
                     ) {
                    sum+=num;
                }
                System.out.println(sum);
            } else if (commandSplit[0].equals("Filter")) {
                int compareToThis = Integer.parseInt(commandSplit[2]);
                switch (commandSplit[1]){
                    case "<":
                        for (int num:nums
                             ) {
                            if (num<compareToThis)
                                System.out.printf("%d ", num);
                        }
                        break;
                    case ">":
                        for (int num:nums
                        ) {
                            if (num>compareToThis)
                                System.out.printf("%d ", num);
                        }
                        break;
                    case ">=":
                        for (int num:nums
                        ) {
                            if (num>=compareToThis)
                                System.out.printf("%d ", num);
                        }
                        break;
                    case "<=":
                        for (int num:nums
                        ) {
                            if (num<=compareToThis)
                                System.out.printf("%d ", num);
                        }
                        break;
                }

                System.out.printf("%n");
            }

            command = scanner.nextLine();
        }

    }

}

package ListsExer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        String command = "";

        for (int i = 0; i < commandsCount; i++) {
            command = scanner.nextLine();

            String[] tokens = command.split(" ");

            if (command.contains("not")){
                if (guests.contains(tokens[0])){
                    guests.remove(tokens[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", tokens[0]);
                }
            }else {
                if (guests.contains(tokens[0])){
                    System.out.printf("%s is already in the list!%n", tokens[0]);
                } else {
                    guests.add(tokens[0]);
                }
            }
        }

        for (String name:guests
             ) {
            System.out.println(name);
        }
    }
}

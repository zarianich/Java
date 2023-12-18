import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeNames = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        String command = "";

        for (int i = 0; i < countOfCommands; i++) {

            command = scanner.nextLine();
            if (command.contains("Include")){

                String[] tokens = command.split(" ");
                coffeeNames.add(tokens[1]);

            } else if (command.contains("Remove")) {

                String[] tokens = command.split(" ");
                int numberOfCoffees = Integer.parseInt(tokens[2]);

                if (numberOfCoffees<=coffeeNames.size()){
                    if (tokens[1].equals("first")){

                        for (int j = 0; j < numberOfCoffees; j++) {
                            coffeeNames.remove(0);
                        }

                    } else if (tokens[1].equals("last")) {

                        for (int j = 0; j < numberOfCoffees; j++) {
                            coffeeNames.remove(coffeeNames.size()-1);
                        }
                    }
                }
            } else if (command.contains("Prefer")) {

                String[] tokens = command.split(" ");
                int coffeOne = Integer.parseInt(tokens[1]);
                int coffeeTwo = Integer.parseInt(tokens[2]);

                String temp = "";

                if (coffeOne>=0&&coffeOne<coffeeNames.size()&&coffeeTwo>=0&&coffeeTwo<coffeeNames.size()){

                    temp = coffeeNames.get(coffeOne);
                    coffeeNames.set(coffeOne, coffeeNames.get(coffeeTwo));
                    coffeeNames.set(coffeeTwo, temp);

                }
            } else if (command.contains("Reverse")) {
                Collections.reverse(coffeeNames);
            }

        }

        System.out.println("Coffees:");
        for (String name:coffeeNames
             ) {
            System.out.printf("%s ", name);
        }
    }
}

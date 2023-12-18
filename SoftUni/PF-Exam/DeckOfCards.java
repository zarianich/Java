import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> deck = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        String command = "";

        for (int i = 0; i < countOfCommands; i++) {
            command = scanner.nextLine();

            String[] tokens = command.split(", ");

            if (command.contains("Add")){

                if (deck.contains(tokens[1]))
                    System.out.println("Card is already in the deck");
                else {
                    deck.add(tokens[1]);
                    System.out.println("Card successfully added");
                }

            } else if (command.contains("Remove At")) {

                int index = Integer.parseInt(tokens[1]);

                if (index>=0&&index<deck.size()){
                    deck.remove(index);
                    System.out.println("Card successfully removed");
                } else System.out.println("Index out of range");

            } else if (command.contains("Remove")) {

                String name = tokens[1];

                if (deck.contains(name)){
                    deck.remove(name);
                    System.out.println("Card successfully removed");
                } else System.out.println("Card not found");

            } else if (command.contains("Insert")) {

                int index = Integer.parseInt(tokens[1]);
                String name = tokens[2];

                if (index>=0&&index<deck.size()){

                    if (deck.contains(name))
                        System.out.println("Card is already added");
                    else {
                        deck.add(index, name);
                        System.out.println("Card successfully added");
                    }
                } else System.out.println("Index out of range");

            }
        }

        for (int i = 0; i < deck.size()-1; i++) {
            System.out.printf("%s, ", deck.get(i));
        }
        System.out.printf("%s ", deck.get(deck.size()-1));

    }
}

package PB_12;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neededBookName = scanner.nextLine();
        boolean bookIsFound = false;
        int booksSearched = 0;
        String input = scanner.nextLine();

        while (!input.equals("No More Books")){
            if (input.equals(neededBookName)){
                bookIsFound = true;
                break;
            }
            booksSearched++;
            input = scanner.nextLine();
        }
        if (bookIsFound)
            System.out.printf("You checked %d books and found it.", booksSearched);
        else System.out.printf("The book you search is not here!%nYou checked %d books.", booksSearched);
    }
}

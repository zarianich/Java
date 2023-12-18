package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        Articles article = new Articles(data[0], data[1], data[2]);

        int n = Integer.parseInt(scanner.nextLine());
        String input = "";

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            data = input.split(": ");

            if (input.contains("Edit")){
                article.Edit(data[1]);
            } else if (input.contains("ChangeAuthor")) {
                article.ChangeAuthor(data[1]);
            } else if (input.contains("Rename")) {
                article.Rename(data[1]);
            }

        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}

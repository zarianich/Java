package Advertisement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();
        int n = Integer.parseInt(scanner.nextLine()); //ouuuuuuuuuuuuuuuuuuuuuuuuuuu :3

        for (int i = 0; i < n; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}

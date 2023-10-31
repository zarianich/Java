package BasicExer;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char text = username.charAt(i);
            password += text;
        }

        String input = scanner.nextLine();
        int tries = 0;
        while (!input.equals(password)){
            tries++;
            if (tries == 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}

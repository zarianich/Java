package PB_12;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width*height;

        while (volume>0){
            String input = scanner.nextLine();
            if (input.equals("STOP"))
                break;
            else {
                int n = Integer.parseInt(input);
                volume-=n;
            }
        }
        if (volume > 0)
            System.out.printf("%d pieces are left.", volume);
        else System.out.printf("No more cake left! You need %d pieces more.", volume*-1);
    }
}

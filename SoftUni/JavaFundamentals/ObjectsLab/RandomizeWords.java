package ObjectsLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int pos2 = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[pos2];
            words[pos2] = temp;
        }

        System.out.println(String.join(System.lineSeparator(), words));
    }
}

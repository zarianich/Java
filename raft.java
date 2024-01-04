import java.util.Arrays;
import java.util.Scanner;

public class raft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);

        int[] goats = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();


        Arrays.sort(goats);

        for (int i = 0; i < goats.length/2; i++) {
            int temp = goats[goats.length - 1 - i];
            goats[goats.length - 1 - i] = goats[i];
            goats[i] = temp;
        }

        int minCapacity = calculateMinCapacity(goats, k);

        System.out.println(minCapacity);
    }

    public static int calculateMinCapacity(int[] goats, int k)
    {
        int minCapacity = goats[0];

        int weight = 0;

        int counter = 0;

        for (int i = 0; i < goats.length; i++) {

            weight += goats[i];

            if ((weight + goats[i]) >= minCapacity){
                counter++;
                weight = 0;
            }


        }

        return minCapacity;
    }

}

package ListsExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] bomb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (nums.contains(bomb[0])) {
            int bombIndex = nums.indexOf(bomb[0]);
            int power = bomb[1];

            for (int i = 1; i <= power; i++) {
                if (bombIndex-1<0)
                    break;
                nums.remove(bombIndex - 1);
                bombIndex--;
            }

            for (int i = 1; i <= power; i++) {
                if (bombIndex+1>nums.size()-1)
                    break;
                nums.remove(bombIndex + 1);
            }

            nums.remove(bombIndex);
        }
            int sumOfNumbersLeft = 0;

            for (int num : nums
            ) {
                sumOfNumbersLeft += num;
            }
            System.out.println(sumOfNumbersLeft);
        }

}

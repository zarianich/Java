import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int goalsScored = 0;
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = playerName;

        while (!playerName.equals("END")){
            goalsScored = Integer.parseInt(scanner.nextLine());

            if (goalsScored>=10){
                maxGoals = goalsScored;
                bestPlayer = playerName;
                break;
            }

            if (goalsScored>maxGoals){
                maxGoals = goalsScored;
                bestPlayer = playerName;
            }
            playerName = scanner.nextLine();
        }

        if (maxGoals>=3)
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", bestPlayer, maxGoals);
        else System.out.printf("%s is the best player!%nHe has scored %d goals.", bestPlayer, maxGoals);
    }
}

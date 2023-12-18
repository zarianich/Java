import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int biscuitsFromCompetitor = Integer.parseInt(scanner.nextLine());

        //calculate how many biscuits my factory produces
        //every third day we produce only 75% of the usual
        //biscuits can only be whole (Math.floor them)

        int biscuitsProduced = calculateProduction(biscuitsPerDayPerWorker, countOfWorkers);

        //calculate the difference with competitor (in percentages) (always will be different)

        boolean moreThanCompetitor = biscuitsProduced > biscuitsFromCompetitor;
        double differenceWithCompetitor = 0;

        if (moreThanCompetitor){
            differenceWithCompetitor =
                    (biscuitsProduced-biscuitsFromCompetitor)*1.0/biscuitsFromCompetitor*100.0;
        } else {
            differenceWithCompetitor =
                    (biscuitsFromCompetitor-biscuitsProduced)*1.0/biscuitsFromCompetitor*100.0;
        }

        //print the amount of biscuits produced

        System.out.printf("You have produced %d biscuits for the past month.%n", biscuitsProduced);

        //print the difference (format to the 2nd decimal place)

        if (moreThanCompetitor)
            System.out.printf("You produce %.2f percent more biscuits.", differenceWithCompetitor);
        else System.out.printf("You produce %.2f percent less biscuits.", differenceWithCompetitor);
    }

    public static int calculateProduction(int biscuitsPerDayPerWorker, int countOfWorkers){

        int thirdDayCounter = 0;
        int totalProduced = 0;

        for (int i = 1; i <= 30; i++) {
            thirdDayCounter++;

            if (thirdDayCounter==3){
                totalProduced+= Math.floor(biscuitsPerDayPerWorker*countOfWorkers*0.75);
                thirdDayCounter = 0;
            } else totalProduced+= biscuitsPerDayPerWorker*countOfWorkers;
        }

        return totalProduced;

    }
}

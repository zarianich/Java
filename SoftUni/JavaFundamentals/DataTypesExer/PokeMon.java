package DataTypesExer;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int targetsPoked = 0;
        int pokePowerLeft = pokePower;

        while (pokePowerLeft>=distanceBetweenTargets){
            pokePowerLeft-=distanceBetweenTargets;
            targetsPoked++;
            if (pokePowerLeft == pokePower/2) {
                if (exhaustionFactor!=0)
                    pokePowerLeft /= exhaustionFactor;
            }
        }

        System.out.println(pokePowerLeft);
        System.out.println(targetsPoked);
    }
}

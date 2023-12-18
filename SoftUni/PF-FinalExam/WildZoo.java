import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //map with hungry animals
        Map<String, Integer> hungryAnimals = new LinkedHashMap<>();

        //map with animals in areas
        Map<String, String> animalsInAreas = new LinkedHashMap<>();

        //count hungry animals in areas
        Map<String, Integer> areas = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("EndDay")){

            String[] tokens = input.split(" ");

            if (tokens[0].equals("Add:")){
                String[] stats = tokens[1].split("-");
                String animalName = stats[0];
                int neededFood = Integer.parseInt(stats[1]);
                String area = stats[2];

                if (hungryAnimals.containsKey(animalName)){
                    hungryAnimals.put(animalName, hungryAnimals.get(animalName) + neededFood);
                }
                else {
                    hungryAnimals.put(animalName, neededFood);
                    animalsInAreas.put(animalName, area);
                    if (areas.containsKey(area)){
                        areas.put(area, areas.get(area) + 1);
                    }else {
                        areas.put(area, 1);
                    }
                }

            } else if (tokens[0].equals("Feed:")) {
                String[] stats = tokens[1].split("-");
                String animalName = stats[0];
                int food = Integer.parseInt(stats[1]);

                if (hungryAnimals.containsKey(animalName)){

                    hungryAnimals.put(animalName, hungryAnimals.get(animalName) - food);
                    if (hungryAnimals.get(animalName) <= 0){
                        hungryAnimals.remove(animalName);
                        String area = animalsInAreas.get(animalName);
                        animalsInAreas.remove(animalName);
                        if (areas.get(area) == 1){
                            areas.remove(area);
                        }
                        else {
                            areas.put(area, areas.get(area) - 1);
                        }
                        System.out.printf("%s was successfully fed%n", animalName);
                    }

                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, Integer> entry: hungryAnimals.entrySet()){
            System.out.printf(" %s -> %sg%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, Integer> entry: areas.entrySet()){
            System.out.printf(" %s: %s%n", entry.getKey(), entry.getValue());
        }

    }
}

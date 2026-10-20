package part2_macronutrients;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatFactory {

    private static FatFactory instance;
    private final Random random = new Random();

    private FatFactory() {
    }

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }

        return instance;
    }

    public String createFat(DietPlan dietPlan) {

        List<String> options = new ArrayList<>();

        switch (dietPlan) {

            case NO_RESTRICTION:
                options.add("Avocado");
                options.add("Sour cream");
                options.add("Tuna");
                options.add("Peanuts");
                break;

            case PALEO:
                options.add("Avocado");
                options.add("Tuna");
                options.add("Peanuts");
                break;

            case VEGAN:
                options.add("Avocado");
                options.add("Peanuts");
                break;

            case NUT_ALLERGY:
                options.add("Avocado");
                options.add("Sour cream");
                options.add("Tuna");
                break;
        }

        return options.get(random.nextInt(options.size()));
    }
}
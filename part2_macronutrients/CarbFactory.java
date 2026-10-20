package part2_macronutrients;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbFactory {

    private static CarbFactory instance;
    private final Random random = new Random();

    private CarbFactory() {
    }

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }

        return instance;
    }

    public String createCarb(DietPlan dietPlan) {

        List<String> options = new ArrayList<>();

        switch (dietPlan) {

            case NO_RESTRICTION:
                options.add("Cheese");
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                break;

            case PALEO:
                options.add("Pistachio");
                break;

            case VEGAN:
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                break;

            case NUT_ALLERGY:
                options.add("Cheese");
                options.add("Bread");
                options.add("Lentils");
                break;
        }

        return options.get(random.nextInt(options.size()));
    }
}
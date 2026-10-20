package part2_macronutrients;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {

    private static ProteinFactory instance;
    private final Random random = new Random();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }

        return instance;
    }

    public String createProtein(DietPlan dietPlan) {

        List<String> options = new ArrayList<>();

        switch (dietPlan) {

            case NO_RESTRICTION:
                options.add("Fish");
                options.add("Chicken");
                options.add("Beef");
                options.add("Tofu");
                break;

            case PALEO:
                options.add("Fish");
                options.add("Chicken");
                options.add("Beef");
                break;

            case VEGAN:
                options.add("Tofu");
                break;

            case NUT_ALLERGY:
                options.add("Fish");
                options.add("Chicken");
                options.add("Beef");
                options.add("Tofu");
                break;
        }

        return options.get(random.nextInt(options.size()));
    }
}
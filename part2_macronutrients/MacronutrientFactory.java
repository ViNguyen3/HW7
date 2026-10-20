package part2_macronutrients;

public class MacronutrientFactory {

    private static MacronutrientFactory instance;

    private final CarbFactory carbFactory;
    private final ProteinFactory proteinFactory;
    private final FatFactory fatFactory;

    private MacronutrientFactory() {
        carbFactory = CarbFactory.getInstance();
        proteinFactory = ProteinFactory.getInstance();
        fatFactory = FatFactory.getInstance();
    }

    public static MacronutrientFactory getInstance() {

        if (instance == null) {
            instance = new MacronutrientFactory();
        }

        return instance;
    }

    public Meal createMeal(Customer customer) {

        String carb =
                carbFactory.createCarb(customer.getDietPlan());

        String protein =
                proteinFactory.createProtein(customer.getDietPlan());

        String fat =
                fatFactory.createFat(customer.getDietPlan());

        return new Meal(carb, protein, fat);
    }
}
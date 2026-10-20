package part2_macronutrients;

public class Driver {

    public static void main(String[] args) {

        Customer[] customers = {

                new Customer(
                        "Alice",
                        DietPlan.NO_RESTRICTION),

                new Customer(
                        "Bob",
                        DietPlan.PALEO),

                new Customer(
                        "Charlie",
                        DietPlan.VEGAN),

                new Customer(
                        "Diana",
                        DietPlan.NUT_ALLERGY),

                new Customer(
                        "Eric",
                        DietPlan.NO_RESTRICTION),

                new Customer(
                        "Fiona",
                        DietPlan.PALEO)
        };

        MacronutrientFactory factory =
                MacronutrientFactory.getInstance();

        for (Customer customer : customers) {

            Meal meal = factory.createMeal(customer);

            System.out.println(
                    customer.getName()
                            + " - "
                            + customer.getDietPlan()
            );

            System.out.println(meal);
            System.out.println();
        }
    }
}
package part1_builder;

public class Driver {

    public static void main(String[] args) {

        System.out.println("----- Part 1 -----");

        Pizza pizza1 = new Pizza.Builder(
                "Pizza Hut",
                Pizza.Size.SMALL)
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();

        Pizza pizza2 = new Pizza.Builder(
                "Pizza Hut",
                Pizza.Size.MEDIUM)
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .build();

        Pizza pizza3 = new Pizza.Builder(
                "Pizza Hut",
                Pizza.Size.LARGE)
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Olives")
                .addTopping("Chicken")
                .build();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();


        System.out.println("\n----- Part 2 -----");

        // Pizza Hut - Large with 3 toppings
        Pizza pizzaHutLarge = new Pizza.Builder(
                "Pizza Hut",
                Pizza.Size.LARGE)
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();

        // Pizza Hut - Small with 2 toppings
        Pizza pizzaHutSmall = new Pizza.Builder(
                "Pizza Hut",
                Pizza.Size.SMALL)
                .addTopping("Bacon")
                .addTopping("Onions")
                .build();

        // Little Caesars - Medium with 8 toppings
        Pizza littleCaesarsMedium = new Pizza.Builder(
                "Little Caesars",
                Pizza.Size.MEDIUM)
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .addTopping("Olives")
                .addTopping("Peppers")
                .build();

        // Little Caesars - Small with 6 toppings
        Pizza littleCaesarsSmall = new Pizza.Builder(
                "Little Caesars",
                Pizza.Size.SMALL)
                .addTopping("Chicken")
                .addTopping("Pesto")
                .addTopping("Spinach")
                .addTopping("Tomato and Basil")
                .addTopping("Olives")
                .addTopping("Extra Cheese")
                .build();

        // Dominos - Small with 1 topping
        Pizza dominosSmall = new Pizza.Builder(
                "Dominos",
                Pizza.Size.SMALL)
                .addTopping("Pepperoni")
                .build();

        // Dominos - Large with 3 toppings
        Pizza dominosLarge = new Pizza.Builder(
                "Dominos",
                Pizza.Size.LARGE)
                .addTopping("Beef")
                .addTopping("Peppers")
                .addTopping("Extra Cheese")
                .build();


        pizzaHutLarge.eat();
        pizzaHutSmall.eat();

        littleCaesarsMedium.eat();
        littleCaesarsSmall.eat();

        dominosSmall.eat();
        dominosLarge.eat();
    }
}
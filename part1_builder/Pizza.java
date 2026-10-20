package part1_builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    private String chain;
    private Size size;
    private List<String> toppings;

    private Pizza(Builder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println(
                chain + " - " +
                size + " pizza - " +
                toppings
        );
    }

    public static class Builder {

        private String chain;
        private Size size;
        private List<String> toppings = new ArrayList<>();

        public Builder(String chain, Size size) {
            this.chain = chain;
            this.size = size;
        }

        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
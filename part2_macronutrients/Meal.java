package part2_macronutrients;

public class Meal {
    private String carb;
    private String protein;
    private String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "Carb='" + carb + '\'' +
                ", Protein='" + protein + '\'' +
                ", Fat='" + fat + '\'' +
                '}';
    }
}
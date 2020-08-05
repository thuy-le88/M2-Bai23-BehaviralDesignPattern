package thuchanh.TemplateMethodPattern;

public class TacoMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Prepare ingredients for Tacomeal.");
    }

    @Override
    public void cook() {
        System.out.println("Cook Tacomeal.");
    }

    @Override
    public void eat() {
        System.out.println("Eat Tacomeal.");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleanup after Tacomeal.");
    }
}

package thuchanh.TemplateMethodPattern;

public class HamburgerMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Prepare ingredients for Humburger.");
    }

    @Override
    public void cook() {
        System.out.println("Cook Humberger.");
    }

    @Override
    public void eat() {
        System.out.println("Eat Humberger.");
    }

    @Override
    public void cleanup() {
        System.out.println("Cleanup after Humburger meal.");
    }
}

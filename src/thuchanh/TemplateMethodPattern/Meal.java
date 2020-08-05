package thuchanh.TemplateMethodPattern;

abstract class Meal {
    public abstract void prepareIngredients();
    public abstract void cook();
    public abstract void eat();
    public abstract void cleanup();
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanup();
    }
}

package thuchanh.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        Meal humburgerMeal=new HamburgerMeal();
        humburgerMeal.doMeal();
        System.out.println("--------------");
        Meal tacoMeal=new TacoMeal();
        tacoMeal.doMeal();
    }
}

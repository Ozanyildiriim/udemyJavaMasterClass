package Chapter8.Challenges.BurgerChallenge;

public class Main {

    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();

//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("bacon","cheese","mayo");
//        burger.printItem();
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey","7-up","chili");
        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}

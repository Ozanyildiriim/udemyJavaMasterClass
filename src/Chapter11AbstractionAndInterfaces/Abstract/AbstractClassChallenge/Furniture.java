package Chapter11AbstractionAndInterfaces.Abstract.AbstractClassChallenge;

public class Furniture extends ProductForSale{

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " is manufactured in Turkey");
        System.out.printf("The price f the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}

package Chapter11AbstractionAndInterfaces.Abstract.AbstractClassChallenge;

public abstract class ProductForSale {

    protected String type;

    protected double price;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected String description;

    public double getSalePrice(int qty){

        return qty * price;
    }

    public void printPricedItem(int qty){

        System.out.printf("%2d qty at $%8.2f each,  %-15s %35s %n",
                qty, price, type, description);
    }

    public abstract void showDetails();

}

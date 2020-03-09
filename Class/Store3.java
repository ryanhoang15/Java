package Class;

public class Store3 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store3(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("IfElseEx");
    }

    // get price with tax method
    public double getPriceWithTax(){
        double totalPrice = price + (price * .08);
        return totalPrice;
    }
    // main method
    public static void main(String[] args) {
        Store3 lemonadeStand = new Store3("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);


    }
}


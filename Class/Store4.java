package Class;

public class Store4 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store4(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }
    public String toString(){

        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        Store4 lemonadeStand = new Store4("Lemonade", 3.75);
        Store4 cookieShop = new Store4("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
        lemonadeStand.increasePrice(2);
        System.out.println(lemonadeStand);
        System.out.println(lemonadeStand.getPriceWithTax());
    }
}


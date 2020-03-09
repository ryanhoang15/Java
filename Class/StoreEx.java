package Class;

public class StoreEx {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    //void StoreEx(String product, int count, double price) {
    public StoreEx(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        /*
        StoreEx cookieShop = new StoreEx();
        cookieShop.StoreEx("cookies",12,3.75);
        use this 2 for void StoreEx (String product, int count, double price)
         */
        StoreEx cookieShop = new StoreEx("cookies",12,3.75); // this is for public StoreEx
        System.out.println(cookieShop.inventoryCount);
        System.out.println(cookieShop.inventoryPrice);
        System.out.println(cookieShop.productType);

    }
}


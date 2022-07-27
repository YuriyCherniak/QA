package Java8;

public class Order {

    int price;
    Boolean isForVegan;
    String customerName;

    public Order(int price, Boolean isForVegan, String customerName) {
        this.price = price;
        this.isForVegan = isForVegan;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Your order price is " + price + ", is it for vegan? - "
                + isForVegan + " . The name of customer is " + customerName;
    }
}

package Java8;

import java.util.List;

public class OrderFiltering {

    List<Order> orderList;

    OrderFiltering(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void printVegan() {
        for (Order order : orderList) {
            if (order.isForVegan) {
                System.out.println(order);
            }
        }
    }

    public void filteringPriceMoreThen200() {
        for (Order order : orderList) {
            if (order.price > 200) {
                System.out.println(order);
            }
        }
    }
}

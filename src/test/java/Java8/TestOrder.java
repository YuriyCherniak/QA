package Java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestOrder {

    @Test
    public void checkOrder() {
        Order firstOrder = new Order(170, true, "Semen");
        Order secondOrder = new Order(300, false, "Victor");
        Order thirdOrder = new Order(245, false, "Vadym");
        Order fourthOrder = new Order(480, false, "Oleg");
        Order fifthOrder = new Order(174, false, "Anna");
        Order sixthOrder = new Order(600, true, "Julia");
        Order seventhOrder = new Order(190, true, "Yuriy");
        Order eighthOrder = new Order(172, false, "Kolya");

        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder,
                fifthOrder, sixthOrder, seventhOrder, eighthOrder);

        OrderFiltering orderFiltering = new OrderFiltering(orderList);
        orderFiltering.filteringPriceMoreThen200();
    }
}

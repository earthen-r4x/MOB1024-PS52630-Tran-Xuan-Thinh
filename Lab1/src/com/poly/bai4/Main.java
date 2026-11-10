package com.poly.bai4;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("O001", "Alice", 50000));
        orders.add(new ExpressOrder("E001", "Bob", 60000, 20000, 10000));
        orders.add(new ExpressOrder("E002", "Charlie", 70000, 15000, 5000));
        orders.add(new InternationalOrder("I001", "David", 80000, 2, 30000));
        orders.add(new InternationalOrder("I002", "Eve", 90000, 3, 40000));

        System.out.println("=== Danh sach don hang va chi phi van chuyen ===");
        for (Order order : orders) {
            System.out.println(order.toString());
        }

        Order maxShippingCostOrder = orders.get(0);
        for (Order order : orders) {
            if (order.shippingCost() > maxShippingCostOrder.shippingCost()) {
                maxShippingCostOrder = order;
            }
        }
        System.out.println("Don hang co chi phi van chuyen cao nhat: " + maxShippingCostOrder.toString() + ", Shipping Cost: " + maxShippingCostOrder.shippingCost());
    }
}

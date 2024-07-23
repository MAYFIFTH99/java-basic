package class1.ex;

import java.util.Arrays;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("s", 3000, 2);
        orders[2] = createOrder("z", 2000, 2);


        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("total = " + total);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        return new ProductOrder(productName, price, quantity);
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName+order.price+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total=0;
        for (ProductOrder order : orders) {
            total += order.price;
        }
        return total;
    }
}

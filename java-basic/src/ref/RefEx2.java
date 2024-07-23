package ref;

import java.util.Scanner;
import ref.ProductOrder;
public class RefEx2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수: ");
        String productName;
        int price;
        int quantity;

        int n = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요:");
            System.out.print("상품명: ");
            productName = scanner.next();
            System.out.print("가격: ");
            price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            quantity = scanner.nextInt();
            orders[i] = createOrder(productName, price, quantity);
        }
        printOrder(orders);
        System.out.println(getTotalAmount((orders)));

    }





    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
            for (ProductOrder order : orders) {
                System.out.println("상품명: "+order.productName +"가격: " + order.price
                        + "수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total=0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
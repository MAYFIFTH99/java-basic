package ref;
import ref.ProductOrder;
public class RefEx1 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부", 2000, 1);
        productOrders[1] = createOrder("김치", 3000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrders(productOrders);
        System.out.println(getTotalAmount(productOrders));

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder result = new ProductOrder();
        result.productName = productName;
        result.price = price;
        result.quantity = quantity;
        return result;
    }
    static void printOrders(ProductOrder[] orders) {
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


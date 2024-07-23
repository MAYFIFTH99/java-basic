package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount=0;

    void addItem(Item item){
        if (itemCount >= items.length) {
            System.out.println("장바구니 꽉참");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    void displayItems(){
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item x = items[i];
            System.out.println("상품명: "+ x.productName() +", 합계 :" + x.totalPrice());
            total += x.totalPrice();
        }
        System.out.println(total);
    }
}

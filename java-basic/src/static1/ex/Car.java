package static1.ex;

import javax.xml.namespace.QName;

public class Car {
    String name;
    static int count = 0;
    public Car(String s) {
        this.name = s;
        System.out.println("차량 구입, 이름 : " + name);
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + count);
    }
}

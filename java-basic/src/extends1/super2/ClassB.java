package extends1.super2;

public class ClassB extends ClassA {
    public ClassB() {
        super(); // 생략 가능
        System.out.println("B");
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("abB");
    }
}

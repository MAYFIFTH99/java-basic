package poly.diamond;

public class Child implements InterfaceB, InterfaceA {
    @Override
    public void methodB() {
        System.out.println("child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("child.methoCommon");
    }
    @Override
    public void methodA() {
        System.out.println("child.methodA");
    }


}

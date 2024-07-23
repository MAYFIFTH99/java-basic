package poly.diamond.ex6;

public class Bird extends AbstarctAnimal implements Fly {

    @Override
    void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {

    }
}

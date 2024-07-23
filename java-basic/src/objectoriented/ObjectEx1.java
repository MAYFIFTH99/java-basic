package objectoriented;

public class ObjectEx1 {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4,5);

    int area = rectangle.getArea();
    int perimeter = rectangle.getPerimeter();
    boolean square = rectangle.isSquare();

        System.out.println("square = " + square);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }



}

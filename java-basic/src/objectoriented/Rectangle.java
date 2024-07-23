package objectoriented;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getArea() {
        int area = this.width * this.height;
        return area;
    }

     int getPerimeter() {
        int perimeter = 2 * (this.width + this.height);
        return perimeter;
    }

     boolean isSquare() {
        if (this.width == this.height) {
            return true;
        } else {
            return false;
        }

    }
}

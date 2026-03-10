abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.area();
    }
}
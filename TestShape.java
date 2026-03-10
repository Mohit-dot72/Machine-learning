interface Shape2 {
    double PI = 3.14;
    void area();
}

class Rectangle2 implements Shape2 {
    int l, b;

    Rectangle2(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

class Circle implements Shape2 {
    int r;

    Circle(int r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle = " + (PI * r * r));
    }
}

public class TestShape {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(10,20);
        Circle c = new Circle(5);

        r.area();
        c.area();
    }
}

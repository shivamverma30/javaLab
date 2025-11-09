// Q20. Implement hierarchical inheritance where a base class Shape has subclasses Square, Rectangle, and Triangle.
class Shape {
    void show() {
        System.out.println("This is a shape");
    }
}

class Square extends Shape {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Rectangle extends Shape {
    void area(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

class Triangle extends Shape {
    void area(double b, double h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

class a20 {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        s.show();
        s.area(4);

        r.show();
        r.area(5, 3);

        t.show();
        t.area(6, 4);
    }
}

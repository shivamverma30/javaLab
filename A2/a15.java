// Q15. Create an abstract class Shape with an abstract method area() and concrete method display(). Extend it in Circle and Rectangle.
abstract class Shape {
    abstract void area();
    void display() { System.out.println("This is a shape."); }
}

class Circle extends Shape {
    int r = 5;
    void area() { System.out.println("Area = " + (3.14 * r * r)); }
}

class Rectangle extends Shape {
    int l = 4, b = 3;
    void area() { System.out.println("Area = " + (l * b)); }
}

class a15 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.display(); s1.area();
        s2.display(); s2.area();
    }
}

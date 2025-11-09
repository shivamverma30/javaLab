// Q28. Create a class with multiple versions of calculateArea() (for circle, square, rectangle).
class Area {
    void calculateArea(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void calculateArea(int l, int b) {
        System.out.println("Area of rectangle: " + (l * b));
    }

    void calculateArea(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}

class a28 {
    public static void main(String[] args) {
        Area a = new Area();
        a.calculateArea(4);
        a.calculateArea(5, 3);
        a.calculateArea(2.5);
    }
}

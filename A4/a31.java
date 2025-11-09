// Q31. Demonstrate the difference between method overloading and overriding in a single program.
class MathOp {
    // Method Overloading (same name, different parameters)
    void add(int a, int b) {
        System.out.println("Overloading: Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Overloading: Sum = " + (a + b));
    }
}

class AdvMath extends MathOp {
    // Method Overriding (same name, same parameters)
    void add(int a, int b) {
        System.out.println("Overriding: Sum = " + (a + b + 10));
    }
}

class a31 {
    public static void main(String[] args) {
        AdvMath obj = new AdvMath();

        obj.add(5, 5);      // overriding
        obj.add(2.5, 3.5);  // overloading
    }
}

// Q24. Write a program to show compile-time polymorphism (method overloading).
class MathOperation {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

class a24 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        m.add(5, 10);
        m.add(2, 3, 4);
    }
}

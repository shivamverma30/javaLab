// Q36. Accessing variables with different access modifiers.
import utility.AccessDemo;

class a36 extends AccessDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.show();

        // Access from subclass
        a36 sub = new a36();
        System.out.println("\nAccessing from subclass:");
        // System.out.println(sub.a); // private - not accessible
        // System.out.println(sub.b); // default - not accessible outside package
        System.out.println("protected: " + sub.c);
        System.out.println("public: " + sub.d);
    }
}

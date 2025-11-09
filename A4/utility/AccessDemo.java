// Q36. Demonstrate use of all access modifiers (private, default, protected, public).
package utility;

public class AccessDemo {
    private int a = 10;
    int b = 20;             // default
    protected int c = 30;
    public int d = 40;

    public void show() {
        System.out.println("private: " + a);
        System.out.println("default: " + b);
        System.out.println("protected: " + c);
        System.out.println("public: " + d);
    }
}

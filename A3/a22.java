// Q22. Explain and demonstrate the limitation of multiple inheritance in Java using classes.
class A {
    void show() {
        System.out.println("Hello from A");
    }
}

class B {
    void show() {
        System.out.println("Hello from B");
    }
}

// This will cause an error in Java
// class C extends A, B { } // Not allowed - multiple inheritance with classes

// Java supports multiple inheritance through interfaces
interface X {
    void display();
}

interface Y {
    void display();
}

class C implements X, Y {
    public void display() {
        System.out.println("Multiple inheritance using interfaces works fine");
    }
}

class a22 {
    public static void main(String[] args) {
        System.out.println("Java does NOT allow multiple inheritance using classes.");
        System.out.println("But it allows it using interfaces.\n");

        C obj = new C();
        obj.display();
    }
}

// Q34. Write a program to show how multiple inheritance is achieved using interfaces.
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Method from Interface A");
    }

    public void showB() {
        System.out.println("Method from Interface B");
    }
}

class a34 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

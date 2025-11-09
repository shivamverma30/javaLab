// Q23. Write a program to show hybrid inheritance using interface and classes.
interface A {
    void show();
}

class B {
    void display() {
        System.out.println("Class B method");
    }
}

class C extends B implements A {
    public void show() {
        System.out.println("Interface A method");
    }
}

class a23 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
    }
}

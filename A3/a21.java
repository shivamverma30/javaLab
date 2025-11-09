// Q21. Show how constructor chaining works in multilevel inheritance.
class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Constructor of B");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("Constructor of C");
    }
}

class a21 {
    public static void main(String[] args) {
        new C();
    }
}

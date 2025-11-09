// Q16. Show the use of this and super keywords with constructors in base and derived classes.
class Base {
    Base() { System.out.println("Base class constructor"); }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived class constructor using super()");
    }
}

class a16 {
    int x;
    a16(int x) {
        this.x = x;
        System.out.println("this.x = " + x);
    }

    public static void main(String[] args) {
        new Derived();
        new a16(10);
    }
}

// Q26. Show how method resolution occurs in case of overridden methods and dynamic method dispatch.
class Parent {
    void msg() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    void msg() {
        System.out.println("Message from Child");
    }
}

class a26 {
    public static void main(String[] args) {
        Parent p = new Child(); // reference of parent, object of child
        p.msg(); // calls child method (runtime binding)
    }
}

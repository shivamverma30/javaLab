// Q32. Define an interface Printable and implement it in classes Book and Magazine.
interface Printable {
    void print();
}

class Book implements Printable {
    public void print() {
        System.out.println("Printing Book details...");
    }
}

class Magazine implements Printable {
    public void print() {
        System.out.println("Printing Magazine details...");
    }
}

class a32 {
    public static void main(String[] args) {
        Printable p1 = new Book();
        Printable p2 = new Magazine();

        p1.print();
        p2.print();
    }
}

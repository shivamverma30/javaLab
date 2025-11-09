// Q17. Create a class Car with constructor overloading and method to display vehicle information.
class a17 {
    String model;
    int year;

    a17() { model = "Unknown"; year = 0; }
    a17(String m) { model = m; year = 2025; }
    a17(String m, int y) { model = m; year = y; }

    void display() { System.out.println(model + " " + year); }

    public static void main(String[] args) {
        new a17().display();
        new a17("Tata").display();
        new a17("BMW", 2023).display();
    }
}

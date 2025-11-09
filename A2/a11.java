//Q11. Define a class Employee with attributes id, name, salary and create multiple objects to display details.
class a11 {
    int id;
    String name;
    double salary;

    a11(int i, String n, double s) {
        id = i; name = n; salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        a11 e1 = new a11(1, "Shivam", 50000);
        a11 e2 = new a11(2, "Anuj", 60000);
        e1.display();
        e2.display();
    }
}

// Q13. Implement a class Student that contains a constructor to initialize name, roll number, and grade.
class a13 {
    String name;
    int roll;
    char grade;

    a13(String n, int r, char g) {
        name = n; roll = r; grade = g;
    }

    void display() {
        System.out.println(name + " " + roll + " " + grade);
    }

    public static void main(String[] args) {
        a13 s = new a13("Shivam", 101, 'A');
        s.display();
    }
}

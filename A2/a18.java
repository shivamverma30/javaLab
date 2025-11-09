// Q18. Write a program to implement single inheritance using Person → Student.
class Person {
    String name;
    int age;

    void input(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int roll;

    void setRoll(int r) {
        roll = r;
    }

    void display() {
        show();
        System.out.println("Roll No: " + roll);
    }
}

class a18 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input("Rohit", 20);
        s.setRoll(101);
        s.display();
    }
}

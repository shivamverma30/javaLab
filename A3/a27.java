// Q27. Implement a scenario where polymorphism is used to calculate the salary of different types of employees.
class Employee {
    void salary() {
        System.out.println("Employee salary");
    }
}

class Manager extends Employee {
    void salary() {
        System.out.println("Manager salary = 80000");
    }
}

class Clerk extends Employee {
    void salary() {
        System.out.println("Clerk salary = 30000");
    }
}

class Salesperson extends Employee {
    void salary() {
        System.out.println("Salesperson salary = 40000");
    }
}

class a27 {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        e.salary();
        e = new Clerk();
        e.salary();
        e = new Salesperson();
        e.salary();
    }
}

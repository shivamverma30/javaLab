// Q30. Show how method overriding works when superclass reference is used to call a subclass method.
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running safely");
    }
}

class a30 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.run();
    }
}

// Q19. Demonstrate multilevel inheritance using classes Animal → Mammal → Human.
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks");
    }
}

class a19 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
        h.speak();
    }
}

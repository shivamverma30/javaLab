// Q14. Demonstrate the use of static variables and methods inside a class.
class a14 {
    static int count = 0;

    a14() { 
        count++; 
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        new a14(); new a14(); new a14();
        a14.showCount();
    }
}

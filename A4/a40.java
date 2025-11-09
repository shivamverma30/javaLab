// Q40. Create two threads: one to print even numbers and another to print odd numbers up to 50.
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class a40 {
    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();
        e.start();
        o.start();
    }
}

//Q42. Write a program to implement inter-thread communication using wait() and notify() methods.
class Bottle {
    boolean full = false;

    synchronized void drink() {
        if (!full) {
            System.out.println("Bottle is empty, waiting to fill...");
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Drinking water...");
        full = false;
    }

    synchronized void fill() {
        System.out.println("Filling the bottle...");
        full = true;
        System.out.println("Bottle is filled!");
        notify();
    }
}

class a42 {
    public static void main(String[] args) {
        Bottle b = new Bottle();

        // Drinker thread
        new Thread(() -> b.drink()).start();

        // Small delay before filling
        new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            b.fill();
        }).start();
    }
}

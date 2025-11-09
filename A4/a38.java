// Q38. Write a program to create a thread by extending the Thread class and display current thread info.
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        System.out.println("Current Thread: " + Thread.currentThread());
    }
}

class a38 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

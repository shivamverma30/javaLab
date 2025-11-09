// Q41. Create a program to demonstrate thread synchronization for a banking application (deposit and withdraw).
class Bank {
    int balance = 1000;

    synchronized void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Deposited: " + amt + " | Balance: " + balance);
    }

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt + " | Balance: " + balance);
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

class a41 {
    public static void main(String[] args) {
        Bank b = new Bank();

        Thread t1 = new Thread(() -> b.deposit(500));
        Thread t2 = new Thread(() -> b.withdraw(700));

        t1.start();
        t2.start();
    }
}

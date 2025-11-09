// Q33. Create an interface Bank with method getRateOfInterest() and implement it in SBI, ICICI, and Axis.
interface Bank {
    int getRateOfInterest();
}

class SBI implements Bank {
    public int getRateOfInterest() { return 7; }
}

class ICICI implements Bank {
    public int getRateOfInterest() { return 8; }
}

class Axis implements Bank {
    public int getRateOfInterest() { return 9; }
}

class a33 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI ROI: " + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI ROI: " + b.getRateOfInterest() + "%");

        b = new Axis();
        System.out.println("Axis ROI: " + b.getRateOfInterest() + "%");
    }
}

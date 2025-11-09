// Q35. Using MathTools from user-defined package.
import utility.MathTools;

class a35 {
    public static void main(String[] args) {
        MathTools m = new MathTools();
        System.out.println("Factorial of 5: " + m.factorial(5));
        System.out.println("Is 7 prime? " + m.isPrime(7));
    }
}

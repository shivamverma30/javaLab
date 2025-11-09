// Q35. Create a user-defined package utility with a class MathTools that has methods for factorial and prime check.
package utility;

public class MathTools {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
}

import java.util.*;

public class a5 {
    public static void main(String[] args) {
        Scanner golu = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = golu.nextInt();
        
        int a[] = new int[n]; 

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = golu.nextInt();
        }

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        golu.close();
    }
}

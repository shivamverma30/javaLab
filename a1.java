//Write a Java program to check whether a number is even or odd using if-else.

import java.util.*;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");    //   ((n & 1) == 1)
        }
        sc.close();
    }
}

// Create a program to take a number from the command line and display its multiplication table using a for loop.

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        System.out.println("Table of " + n + "is : ");
        for (int i=1; i<=10; i++){
            System.out.println( n + "*" + i + "= " + n*i);
        }
        sc.close();
    }
}

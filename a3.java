// Write a Java program to find the largest of three numbers using nested if-else
 
import java.util.*;
public class a3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a first number :  ");
    int n1 = sc.nextInt();
    System.out.print("enter a second number : ");
    int n2 = sc.nextInt();
    System.out.print("enter a third number : ");
    int n3 = sc.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("Largest number is : " + n1);
        }else if(n2>n3){
            System.out.println("largest number is : " + n2);
        }else {
            System.out.println("largest number is : " + n3);
        }
    sc.close();
    }
}

// Create a program to find the minimum of two numbers

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("finding the minimum of two number");
        System.out.print("enter the first num - num1: ");
        Scanner sc  = new Scanner(System.in);
        int num1 =sc.nextInt();
        System.out.print("enter the second num- num2: ");
        int num2 = sc.nextInt();

        int minimum = num1<num2? num1:num2;

        System.out.println("minimum number of the given two number is : "+minimum);
    }
    
}

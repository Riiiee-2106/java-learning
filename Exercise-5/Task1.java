import java.util.*;
public class Task1 {
    
    //create a program that takes two numbers and show result of all arithmetic operators(+,-,/,%).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("the sum of two number is " + (num1 + num2 ));
        System.out.println("the multiplication of two number is " + (num1 * num2));
        System.out.println("the division of two number is " + (num2 / num1));
        System.out.println("the subtraction of two number is " + (num1 - num2));
    }
}

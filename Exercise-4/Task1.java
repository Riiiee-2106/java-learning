import java.util.*;

public class Task1 {
    //create a program to swap two numbers

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter num1: ");
    int num1 = sc.nextInt();
    System.out.print("enter num2: ");
    int num2 = sc.nextInt();

    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("num1 after swap "+num1);
    System.out.println("num2 after swap "+num2);
}
}

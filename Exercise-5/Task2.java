import java.util.*;

public class Task2 {
    //Create a program to calculate product of two floating point numbers.

    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.print("enter first floating number: ");
        float num1 = sc.nextFloat();
        System.out.print("enter second floating number: ");
        float num2 = sc.nextFloat();

        System.out.println("the product of two floating point numbers are: "+num1*num2);
}

}
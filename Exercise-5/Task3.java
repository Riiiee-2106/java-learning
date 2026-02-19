
import java.util.*;
public class Task3 {
    //Create a program to calculate Perimeter of a rectangle.
 //Perimeter of rectangle ABCD = A + B + C + D

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
         System.out.print("enter third number: ");
        int num3 = sc.nextInt();
        System.out.print("enter fourth number: ");
        int num4 = sc.nextInt();

        System.out.println("perimeter of rectangle: "+(num1+num2+num3+num4 + "cm"));
}

}

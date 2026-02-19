
import java.util.Scanner;

public class Task1 {
    
// Create a program that demonstrates the bitwise AND operation of two numbers.
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num1");
      int num1 = sc.nextInt();
       System.out.println("enter num2");
      int num2 = sc.nextInt();

      int result = num1&num2;
      System.out.println(result);
    }
}

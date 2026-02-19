import java.util.*;

public class Task6 {
    // Create a program that demonstrates the use of the right shift operator.

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter num1");
      int num1 = sc.nextInt();
       System.out.println("enter num2");
      int num2 = sc.nextInt();

      int result = num1>>num2;

      System.out.println(result);
    }
}

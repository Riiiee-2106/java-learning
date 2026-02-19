import java.util.* ;

public class Task4 {

    // Create a program that demonstrates the bitwise complement (NOT) of a number.
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      System.out.print("enter num: ");
      int num = sc.nextInt();
      
      int result = ~num;
      System.out.println(result);
    }
}

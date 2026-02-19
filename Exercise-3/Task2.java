import java.util.*;

public class Task2 {
    //take two numbers input from user and sum it up

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("sum of two number is :"+(num1+num2));
    }

}

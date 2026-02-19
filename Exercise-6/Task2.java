import java.util.*;

public class Task2 {
    // Create a program that determines whether a given number is odd or even

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }


    }
}

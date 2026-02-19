// Create a program to find if the given number is even or odd

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("checking whether the number is even or odd");
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String numType = num%2==0?"even":"odd";
        System.out.println("number is "+numType);
        
    }
    
}

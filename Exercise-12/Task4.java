// Create a program using for to display if a number is prime or not.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("checking whether a number is prime or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();

      boolean isPrime = isPrime(num);
      System.out.println("your number is: "+(isPrime?" Prime":"not prime number"));
    }

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
                
            }
        }
        return true;
    }
    
}

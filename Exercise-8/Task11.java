// Create a program to verify if a number is a palindrome.

import java.util.Scanner;

public class Task11 

{


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int first = sc.nextInt();

        boolean isPalindrome = isPalindrome(first);
        System.out.println(isPalindrome);

    }


    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
    }


    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num%10;
            newNum = newNum*10 + digit;
            num/=10;

        }
        return newNum;
    }
    
}

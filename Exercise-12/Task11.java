// Create a program using recursion to check if a string is a palindrome

import java.util.Scanner;

public class Task11 {
    
    public static void main(String[] args) {
        System.out.println("checking if a string is palindrome using recursion");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s= sc.nextLine();
        System.out.println("your string is "+((isPalindrome(s)?"palindrome":"is not palindrome")));
    }



    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }

        if(s.charAt(0) !=s.charAt(s.length()-1)){
            return false;
        }

        String newS = s.substring(1,s.length()-1);
        return isPalindrome(newS);
    }
}

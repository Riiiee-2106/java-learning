// Create a program that computes the sum of the digits of an integer.

import java.util.*;
public class Task4 {

    public static int sumOfDigit(int num){
            int countDigit=0;
            while(num>0){
         countDigit+= num%10;
             num/=10;
            }
            return countDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int num = sc.nextInt();

        System.out.println(sumOfDigit(num));

    }
    
}

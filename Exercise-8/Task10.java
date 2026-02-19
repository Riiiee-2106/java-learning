// Create a program to check if a number is an Armstrong number.

import java.util.Scanner;

public class Task10 {



    public static boolean isArmstrong(int num){

        int digit = countDigit(num);
        int numCopy = num;
        int finalNum = 0;
        while(num>0){
            int LastDigit = num%10;
            num/=10;
            finalNum+=pow(LastDigit,digit);
        }

        return finalNum == numCopy;
    }

    public static int pow(int num1,int num2){
        int result = 1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }return result;
    }


    public static int countDigit (int num){
        int digit = 0;

        while(num>0){
            digit++;
            num/=10;
        }


        return digit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int first = sc.nextInt();

        boolean isArmstrong = isArmstrong(first);
        if(isArmstrong) {
            System.out.println("your number is armstrong");
        }
        else{
            System.out.println("your number is not armstrong");
        }

      
    }
    
}

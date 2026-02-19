// Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.*;
public class Task6 {


   
    public static int findGcd(int first,int second){

       int gcd = 1;
       int i=2;
       
       int least = least(first,second);
        while(i<=least){
            if(first%i ==0  &&  second%i==0){
                gcd = i;
            }
            i++;
        }
            return gcd;

        }
    


    public static int least(int num1, int num2){
        if(num1<num2) return num1;
        else return num2;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("enter first num : ");
        int first = sc.nextInt();


          System.out.print("enter second num : ");
        int second = sc.nextInt();

        System.out.println(findGcd(first, second));
    
    }
    
}

    


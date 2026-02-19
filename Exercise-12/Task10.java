// Create a program using recursion to display the Fibonacci series up to a certain number

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {
        System.out.println("fibonacci series upto a certain number - ");
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
     
        for(int i=1;i<=num;i++){
            System.out.println(fibbonacci(i)+ " ");
        }

    }


        public static int fibbonacci(int position){
            System.out.print(".");
            if(position==1){
                return 0;
            }
          
            if(position==2){
                return 1;
            }

        
            return fibbonacci(position-1)+fibbonacci(position-2);
        }
        
    }
    


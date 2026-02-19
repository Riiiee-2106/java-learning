// Create a program using continue to print only even numbers, skipping odd numbers

import java.util.Scanner;
public class Task9 {
    

    public static void main(String[] args) {
        System.out.println("printing all even numbers skipping odd numbers");

        int[]arr = ArrayUtility.inputArray();

        printEven(arr);
          
    }

        public static void printEven(int []numbers){
            for(int num:numbers){
                if(num%2!=0){
                    continue;
                }
                System.out.print(num+" ");
            }

            }
          
        
         
    }

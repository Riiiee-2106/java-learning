// Create a program to check whether the given array is sorted or not.

import java.util.Scanner;

public class Task4 {
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to array sorting program\n");
        int[]arr = ArrayUtility.InputArray();

        boolean sortedInc = isSortedInc(arr);
        boolean sortedDec = isSortedDec(arr);

        if(sortedInc||sortedDec){
                System.out.println("array is sorted");
        }
        else{
                System.out.println("array is not sorted");
        }

     }

     public static boolean isSortedInc (int[]arr){
        int i=1;
        while(i<arr.length){
                if(arr[i-1]>arr[i]){
                        return false;
                }
                i++;
                }
        
        return true;

     }


     
     public static boolean isSortedDec (int[]arr){
        int i=0;
        while(i<arr.length-1){
                if(arr[i]<arr[i+1]){
                        return false;
                }
                i++;
        }
        return true;

     }



}

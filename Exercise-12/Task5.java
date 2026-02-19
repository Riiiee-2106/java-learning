// Create a program using for-each to find the maximum value in an integer array.

import java.util.*;
public class Task5 {

     


    public static void main(String[] args) {
        System.out.println("welcome we will be finding maximum number\n");
        int[]arr = ArrayUtility.inputArray();

        int max = maximum(arr);
        System.out.println("maximum element of all the elements of an array is: "+max);

    }


    public static int maximum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    
}

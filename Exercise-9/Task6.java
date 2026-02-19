// Create a program to reverse an array. 

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to reverse the element\n");
        int[]arr = ArrayUtility.InputArray();

        reverseArr(arr);
        ArrayUtility.display(arr);
    
}


public static void reverseArr(int []arr){
  int start = 0;
  int end = arr.length-1;
  while(start<end){
    int temp= arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  
    start++;
    end--;
  }
  
    }
}

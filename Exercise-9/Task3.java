
import java.util.Scanner;

// Create a program to find the maximum and minimum element in an array.

public class Task3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to find maximum and minimum element of an array\n");

        int[]arr = ArrayUtility.InputArray();
        int max = maximumNum(arr);
        int min = minimumNum(arr);

        System.out.println("maximum value of all number is: "+max);
        System.out.println("minimum value of all number is: "+min);
        
    }


    public static int maximumNum(int[]arr){
        int max = Integer.MIN_VALUE;

        if(arr.length ==0){
            return Integer.MIN_VALUE;
        }
        int i=0;
        while(i<arr.length){
            if(arr[i]>max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }


    public static int minimumNum(int[]arr){
        int min = Integer.MAX_VALUE;

        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        int i=0;
        while(i<arr.length){
            if(arr[i]<min){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    }


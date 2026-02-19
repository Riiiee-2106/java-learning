// Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers

import java.util.Scanner;

public class Task8 {
    

    public static void main(String[] args) {
        System.out.println("suming all positive number skipping any negative number if entered");

        int[]arr = ArrayUtility.inputArray();

        int sum = sumPos(arr);
        System.out.println("sum of all positive numbers are: "+sum);        
    }

        public static int sumPos(int []num){
            int sum = 0;
            for(int i=0;i<num.length;i++){
                if(num[i]<0){
                    continue;
                }
                sum +=num[i];

            }
          
        
          return sum;
    }
}

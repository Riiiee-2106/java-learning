// Create a program to find the sum and average of all elements in a 2-D array.

import java.util.*;
public class Task10 {
   
    public static void main(String[] args) {
        System.out.println("welcome to sum and avg of 2d arrays");

        int[][]num = ArrayUtility.Input2DArray();
       
        long sum = sum(num);
         System.out.print("sum of all element in 2d array: "+sum+"\n");
       
        double avg = avg(num);
         System.out.println("avg of all elements in 2d array:"+avg+"\n");

    }


    public static long sum(int[][]num){
        long sum = 0;
        int i=0;
        while(i<num.length){
            int j =0;
            while(j<num[i].length){
                sum+=num[i][j];
                j++;
            }i++;
        }

       
 return sum;
}

    public static double avg(int[][]num){
        if(num.length == 0){
            return 0;
        }
        int rows = num.length;
        int col = num[0].length;
        double size = rows*col;
        double avg = sum(num)/size;
        return avg;
}

}
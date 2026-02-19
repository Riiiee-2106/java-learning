import java.util.*;
public class Task1 {
    // Create a program to find the sum and average of all elements in an array.


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("welcome to array sum and avg");
      int [] numArray = ArrayUtility.InputArray();

      long sum = sum(numArray);
      double avg = avg(numArray);
      System.out.println("sum of the numbers is: "+sum);
      System.out.println("avg of the numbers is: "+avg);

    }

    public static long sum(int[]numArray){

        long sum = 0;
       int i=0;
       while(i<numArray.length){
        sum+=numArray[i];
          i++;
       }
     
       return sum;
    }

    public static double avg(int[]numArray){
        double sum = sum(numArray);
        return ((sum/numArray.length));
    
}
}

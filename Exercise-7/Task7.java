import java.util.*;

public class Task7 {
    // Write a program to check whether a given number is even or odd using bitwise operators.

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter num");
      int num = sc.nextInt();

     

      if((num&1)==1){
        System.out.println("odd");
      }else{
         System.out.println("even");
      }
    
       


    }
}

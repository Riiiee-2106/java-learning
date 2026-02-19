// Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.*;

public class Task5 {

    public static int findLcm(int first,int second){

        int i=1;

        while (true) { 
            int factor = first*i;

            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("enter first num : ");
        int first = sc.nextInt();


          System.out.print("enter second num : ");
        int second = sc.nextInt();

        System.out.println(findLcm(first, second));
    
    }
    
}

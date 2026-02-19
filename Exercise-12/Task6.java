// Create a program using for-each to find the occurrences of a specific element in an array.

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("finding the occurence of an element");
        int[]arr = ArrayUtility.inputArray();
        System.out.print("enter the element you want to find occurence of: ");
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();
       int occ = occurences(arr,el);
       System.out.println("the occurence of a number in an array is: "+occ);
    }


    public static int occurences(int[]arr,int el){
        int count = 0;
        for(int num:arr){
            if(num==el){
                count++;
            }
        }
        return count;
    }
    
}

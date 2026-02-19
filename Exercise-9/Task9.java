// Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class Task9 {
    

    public static void main(String[] args) {
       

        System.out.println("searching an element in 2-D array\n");
         int[][]arr = ArrayUtility.Input2DArray();
         System.out.println("enter the numbers you want to search: ");
         Scanner sc = new Scanner(System.in);
         int key = sc.nextInt();
        boolean search = search(arr, key);
        if(search){
            System.out.println("number found");
        }
        else{
            System.out.println("number not found");
        }

    }


    public static boolean search(int[][]arr,int key){
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
            if(arr[i][j] == key){
             return true;
            }j++;
        }i++;
    }return false;
}
}
// Create a program to delete a specific element from an array and return the new array.

import java.util.Scanner;

public class Task5 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to array sorting program\n");
        int[]arr = ArrayUtility.InputArray();

        System.out.println("enter the element you want to delete : ");

        int numToDel = sc.nextInt();

        int[]newArr = deleteNum(arr, numToDel);

        ArrayUtility.display(newArr);


     }

   public static int[] deleteNum(int[] num, int numToDel) {
    // Count occurrences of numToDel
    int occ = Task2.occurences(num, numToDel);
    if (occ == 0) {
        return num; // element not found, return original array
    }

    int newSize = num.length - occ;
    int[] newArr = new int[newSize];

    int j = 0;
    for (int i = 0; i < num.length; i++) {
        if (num[i] != numToDel) {
            newArr[j] = num[i];
            j++;
        }
    }
    return newArr;
}

}


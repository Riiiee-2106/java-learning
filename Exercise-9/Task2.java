import java.util.*;

// Create a program to find the number of occurrences of a given element in an array.
public class Task2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to array occurences\n");
        int[]arr =  ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = sc.nextInt();
        int occurences = occurences(arr, num);
        System.out.println("there are in total "+occurences+" occurences of the number given by you");

    }


    public static int occurences(int[]arr,int key) {
        int count = 0;
        int i=0;
        while(i<arr.length){
            if(arr[i] ==key){
                count++;
            }
                i++;
            
        }
        return count;
    }
}

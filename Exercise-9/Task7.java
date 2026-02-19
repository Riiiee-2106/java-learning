
import java.lang.reflect.Array;

// Create a program to check whether the given array is a palindrome or not.


public class Task7 {
    public static void main(String[] args) {

        int[]arr = ArrayUtility.InputArray();
        System.out.println("checking whether the array elements are palindrome");


        boolean isPalin = isPalindrome(arr);
        if(isPalin){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }

    public static boolean isPalindrome(int[]arr){
        
     int i=0;
     while(i<arr.length/2){
        if(arr[i]!=arr[arr.length-1-i]){
            return false;
        }
        i++;
     }
     return true;
    }
}

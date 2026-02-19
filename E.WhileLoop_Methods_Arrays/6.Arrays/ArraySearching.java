import java.util.Scanner;


public class ArraySearching{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,9,34};
        System.out.println("Welcome to Arrays Searching\n");
        System.out.println("enter the number you want to search");

        int num = sc.nextInt();
        
        int target = search(arr,num);
        if(target==1){
            System.out.println("found the number");

        }
        else{
            System.out.println("didn't found the number");

        }
    }


    public static int search(int[]arr,int key){
        int i =0;

        while(i<arr.length){
            if(arr[i]==key){
                return 1;
               
            } 
            i++;
        }
        return 0;
    }
}

// Create a program to sum all odd numbers from 1 to a specified number N
import java.util.*;
public class Task2 {


    public static void sumOddNum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            System.out.println(sum);
            i+=2;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int num = sc.nextInt();

        sumOddNum(num);
    }
    
}

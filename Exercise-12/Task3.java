
// Create a program using for loop to generate a multiplication table for a number.

import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        System.out.println("multiplication table of given num");
        System.out.print("please enter the num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"= "+(num*i));
        }
    }
}

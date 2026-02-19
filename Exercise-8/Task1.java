// Develop a program that prints the multiplication table for a given number

import java.util.Scanner;

public class Task1 {
    
    public static void multiplicationTable(int num){
        int i=1;
        while(i<=10){
            System.out.println(num + "x" +i+ "="+ (num*i) );
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int num = sc.nextInt();

        multiplicationTable(num);
        
    }
}

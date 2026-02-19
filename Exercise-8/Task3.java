// Write a function that calculates the factorial of a given number.


import java.util.*;

public class Task3 {
    




    public static void factNum(int num){
        long fact=1;
        if(num<2){
           System.out.println(fact*1);
        }
        int i=1;
        while(i<=num){
            fact*=i;
            System.out.println(fact);
            i++;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int num = sc.nextInt();

        factNum(num);
    }
    

}

import java.util.*;
// Create a program to check whether a given number is prime.
public class Task7 {

    public static int primeNum(int number){
        int i=2;
        while(i<number){
            if(number%i==0){
                System.out.println("not prime number");
                return -1;
            }else{
                System.out.println("prime number");
             
            }i++;
        }   return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();
        int prime = primeNum(number);
        System.out.println(prime);
    }
    
}

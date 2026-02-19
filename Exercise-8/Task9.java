import java.util.*;
// Create a program to print the Fibonacci series up to a certain number.
public class Task9 {
    


   
public static void printFibonacci(int num){
   
    if(num<0) return;
        System.out.print("0 " );
    
    if(num==0)
        return;
        System.out.print("1 ");
    

     int first =0 ,second=1;
    while(first+second<=num){
        int third = first+second;
        System.out.print(third+" ");
        
        first = second;
        second = third;
    }
}
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int first = sc.nextInt();

        printFibonacci(first);
    }
    
}



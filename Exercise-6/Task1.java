import java.util.*;
public class Task1 {
    

    // Create a program that determines whether a given number is positive, negative, or zero.

    public static void main(String[] args) {
    
    
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if(num>0){
        System.out.println("number is greater than 0,which is positive");
    }
    else if(num<0){
        System.out.println("number is less than 0,which is negative");
    }
    else{
        System.out.println("number is zero.");
    }

}

}

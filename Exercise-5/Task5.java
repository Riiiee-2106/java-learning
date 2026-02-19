import java.util.*;

public class Task5{
    //Create a program to calculate Simple Interest.
//Simple Interest = (P × T × R) / 100

public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
        System.out.print("enter p: ");
        int p = sc.nextInt();
        System.out.print("enter r: ");
        float r = sc.nextFloat();
      

        System.out.print("enter t: ");
        float t = sc.nextFloat();
       
        System.out.println("simple interest: "+(p*r*t)/100);

}

}
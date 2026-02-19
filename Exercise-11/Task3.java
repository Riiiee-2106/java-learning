
import java.util.Scanner;
// Create a program to calculate the absolute value of a given integer
public class Task3 {
    

    public static void main(String[] args) {
        System.out.println("converting number to it's absolute form");
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int noType = num<0?-num:num;
        System.out.println("number is converted to: "+noType);
        
    }
    
}


import java.util.*;
public class Task7 {
    //Create a program to convert Fahrenheit to Celsius.
 //°C = (F − 32) × 5 / 9

 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your fahrenheit temperature: ");
    double fahrenheit = sc.nextDouble();

    double celsius = (fahrenheit-32)*5/9;

    System.out.println("temperature in celsius is : "+celsius+" C");

 }
}

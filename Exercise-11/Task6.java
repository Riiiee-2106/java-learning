// Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("welcome to perform basic arithematic operations");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("enter the operation you want to perform: ");
        String operation = sc.next();

        int result = switch(operation){
            case "+"-> num1+num2;
            case "-"-> num2-num1;
            case "*"-> num1*num2;
            case "/"-> num2/num1;
            case "%"-> num2%num1;
            default-> -1;

        };

        System.out.println("answer is: "+result);
    }
    
}

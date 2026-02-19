// Create a program to, based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50–80, Low for < 50).


import java.util.*;
public class Task4 {
    
    public static void main(String[] args) {
        System.out.println("welcome to student score");
        System.out.print("please enter your marks: ");
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        String category = marks>80?"High":(marks>50?"moderate":"low");
        System.out.println("your marks category is : "+category);


    }

}

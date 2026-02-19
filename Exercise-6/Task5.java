import java.util.*;

public class Task5 {
//     Create a program that calculates grades based on marks according to the following criteria:

// A → above 90%

// B → above 75%

// C → above 60%

// D → above 30%

// F → below 30%


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the percentage: %");
   

    int marks = sc.nextInt();

    if(marks>=90){
        System.out.println('A');
    }
    else if(marks >=75){
        System.out.println('B');
    }
    else if(marks>=60){
        System.out.println('C');
    }
    else if(marks>=30){
        System.out.println('D');
    }
    else{
        System.out.println('E');
    }
}
}

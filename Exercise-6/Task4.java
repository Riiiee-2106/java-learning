import java.util.*;

public class Task4 {
    // Create a program that determines whether a given year is a leap year
// (A year is a leap year if it is divisible by 4 but not by 100, unless it is also divisible by 400).

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter year");
    int year = sc.nextInt();

   
//    if(year%400==0){
//     System.out.println("your year is a leap year");
//    }
//    else if((year%4==0) && (year%100!=0)){
//     System.out.println("your year is a leap year");

//         }else{
//             System.out.println("your year is not a leap year");
//         }





if((year%400==0)||(year%4==0 && year%100!=0)){
    System.out.println("your year is a leap year");
}
else{
    System.out.println("your year is not a leap year");
        }



    }
}



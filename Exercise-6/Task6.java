import java.util.*;

public class Task6 {
//     Create a program that categorizes a person into different age groups:

// Child → below 13 years

// Teen → below 20 years

// Adult → below 60 years

// Senior → above 60 years

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age: ");
    int age = sc.nextInt();


    if(age>60){
        System.out.println("senior");
    }
    else if(age>20){
        System.out.println("adult");
    }
    else if(age>13){
        System.out.println("teen");
    }
    else{
        System.out.println("child");
    }
}
}

// Create a program using do-while to find password checker until a valid password is entered.

import java.util.Scanner;

public class Task1 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to password checker");
        String password;
        

        do{
            System.out.println("enter a password");
            password =sc.next();
        }while(!isValidPassword(password));
        System.out.println("thanks for entering valid password,you're logged in");
        
    }


    public static boolean isValidPassword(String password){
        return password.length() >6;

    }



}

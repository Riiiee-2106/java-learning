// Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("enter your command: ");
            String command = sc.next();
            if(command.equals("exit")){
                break;
            }
        }

        System.out.println("exited from the window successfully");
    }
}

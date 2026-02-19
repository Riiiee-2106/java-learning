
// Create a program using do-while to implement a number guessing game.

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        System.out.println("guessing the number game");
        Scanner sc = new Scanner(System.in);
        int num=5;
        int guess ;
        do{
            System.out.println("entered your guessed number between 0 to 9");
            guess = sc.nextInt();
        }while(num!=guess);
        System.out.println("your guessed number is correct "+guess);
    }

}

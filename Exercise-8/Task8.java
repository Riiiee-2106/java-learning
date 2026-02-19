// Create a program to reverse the digits of a number.

import java.util.Scanner;

class Task8{

public static int reverseDigit(int num){
    int revNum = 0;
    
    while(num>0){
        int lastDigit = num%10;
        revNum =revNum*10+lastDigit;
        num/=10;
    }

    return revNum;
}

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();
        int revNum = reverseDigit(number);
        System.out.println(revNum);
}
}

import java.util.Scanner;

public class TerneryOperator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to number checker");
        System.out.print("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Now enter the second number: ");
        int num2 = sc.nextInt();





        // if(num1>num2){
        //     System.out.println(num1+" is the greater number");
        // }

        // else{
        //     System.out.println(num2 +" is the greater number");
        // }


    //     int greaterNum;
    //     if(num1>num2){
    //         greaterNum = num1;
    //     }

    //     else{
    //         greaterNum = num2;
    //     }

    //     System.out.println(greaterNum+ " is the greatest number");
    // }


    int greaterNum = num1>num2? num1:num2;
         System.out.println(greaterNum+ " is the greatest number");
    }
    
}

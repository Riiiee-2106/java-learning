import java.util.Scanner;

public class FirstRecursion {
    

    public static void main(String[] args) {
        System.out.println("welcome to factorial calculator");
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Long fact = factorial(num);
        System.out.println("factorial of given "+num+" is: "+fact);
    }

    public static long factorial(int num){
        System.out.println("function called for: "+num);
        if(num==1){
            return 1;
        }
       
        return num*factorial(num-1);

    }
}

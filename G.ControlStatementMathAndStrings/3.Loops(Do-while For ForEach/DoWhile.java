import java.util.Scanner;

public class DoWhile {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        
        int age = -1;
        do{
            System.out.print("please enter your correct age: ");
            age = sc.nextInt();
        }while(age>0 && age<100);
        System.out.println("your age is: "+age);
    }

}

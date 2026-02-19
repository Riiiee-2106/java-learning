import java.util.*;

public class UserInput11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("please enter your name: ");
        String name = input.nextLine();
        System.out.println("your name is "+name);
        System.out.print("tell me your age: ");
        int age = input.nextInt();
        System.out.println("your age is "+age);



    }
}

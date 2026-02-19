import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to ticket discount calculator");
        System.out.print("please enter your age");
        int age = sc.nextInt();
        System.out.println("are you a female? (true/false");
        boolean isFemale = sc.nextBoolean();

        if(age<5){
            System.out.println("you'll got 75% discount ");
        }else if(isFemale){
            System.out.println("you got 50% discount");
        }else if(age>60 && !isFemale){
            System.out.println("you'll 25% discount ");
        }else{
            System.out.println("you got no discount");
        }

    }
}

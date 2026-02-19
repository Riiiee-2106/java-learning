import java.util.*;

public class Loops {
    
    public static void main(String[] args) {
        

        // counting from 1 to 10

        int num = 1;  //initialization

        while(num<=10){  //condition
            System.out.println(num); //actual work
            num = num+1; //updating the condition
        }



        int count = 500;
        while(count>=200){
            System.out.println(count);
            count-=1;
        }


        Scanner sc = new Scanner (System.in);
        int i=0;
        while(i<5){
            String name = sc.nextLine();
            System.out.println(name);
            i++;
        }

    }
}

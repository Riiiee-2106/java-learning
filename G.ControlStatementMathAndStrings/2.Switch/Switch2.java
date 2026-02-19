import java.util.Scanner;

public class Switch2 {
    

    public static void main(String[] args) {
        System.out.println("welcome to months checker");
        System.out.print("please enter the months in number: ");
        Scanner sc = new Scanner(System.in);
        int months = sc.nextInt();


    


        
            
        String output = switch(months){
            case 1 -> "january";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11 -> "november";
            case 12 -> "december"; 
            default -> "not valid month";
        
        };

        System.out.println(output);
        }
    }

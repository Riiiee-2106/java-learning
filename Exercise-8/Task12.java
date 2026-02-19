import java.util.Scanner;

public class Task12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("We are here to print patterns");
        System.out.print("Please enter the number of rows: ");
        int rows = sc.nextInt();
        
        printFirstPattern(rows);
        printSecondPattern(rows);
        printThirdPattern(rows);
        
        sc.close();
    }

    // Right Half Pyramid
    public static void printFirstPattern(int maxRows){
        System.out.println("Here is the right half pyramid:");
        int rows = 1;
        while(rows <= maxRows){
            int col = 0;
            while(col < rows){
                System.out.print("* ");
                col++;
            }
            System.out.println(); // move to next line
            rows++;
        }
    }

    // Reverse Right Half Pyramid
    public static void printSecondPattern(int maxRows){
        System.out.println("Here is the reverse right half pyramid:");
        int rows = maxRows;
        while(rows > 0){
            int col = 0;
            while(col < rows){
                System.out.print("* ");
                col++;
            }
            System.out.println(); // move to next line
            rows--;               // decrease row count
        }
    }

    // Left Half Pyramid
    public static void printThirdPattern(int maxRows) {
        System.out.println("Here is the left half pyramid:");
        int rows = 0;
        while (rows < maxRows) {
            int space = maxRows - rows - 1;
            while (space > 0) {
                System.out.print("  "); // spaces for alignment
                space--;
            }
            int col = 0;
            while (col <= rows) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            rows++;
        }
    }
}

import java.util.*;

public class PatternMethod {
    

    public static void pattern(){
        int rows=0;
    
        while(rows<5){
            System.out.print('*');
                int col= 0;
                while(col<rows){
                     System.out.print('*');
                      col++;
                }
            rows++;
        
        System.out.println();
            }
    }

    public static void main(String[] args) {
        pattern();
    }
}

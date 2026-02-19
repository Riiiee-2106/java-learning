import java.util.*;

public class Task4 {
    //Create a program to calculate the Area of a Triangle.
  //Area of triangle = ½ × B × H

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter base: ");
        int base = sc.nextInt();
        System.out.print("enter height: ");
        int height = sc.nextInt();

        System.out.println("area of triangle: "+ 0.5*base*height +" cm2");

}
}
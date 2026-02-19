import java.util.*;

public class Task6 {
    //Create a program to calculate Compound Interest.
//Compound Interest = P (1 + R / 100)ᵗ

public static void main(String[] args) {
    

  Scanner sc = new Scanner(System.in);
        System.out.print("enter p: ");
        int p = sc.nextInt();
        System.out.print("enter r: ");
        float r = sc.nextFloat();
      

        System.out.print("enter t: ");
        float t = sc.nextFloat();


        double compoundInterest = p*Math.pow((1+r/100),t) ;
        System.out.println("compound interest: "+compoundInterest);
}
}

//Explanation (step by step)

// Math
// This is a class in Java (java.lang.Math) that contains many mathematical methods.

// pow()
// This is a static method of the Math class.
// It is used to calculate power.

// Method call syntax

// Math.pow(base, exponent)


// In your code:

// Base → (1 + r/100)

// Exponent → t

// So the method call calculates:
// (1+r/100)t
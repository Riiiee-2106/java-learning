

public class TypeConversion12 {
    public static void main(String[] args) {
        

        float myFloat = 5; //automatic type conversion (widening -implicit)
        System.out.println(myFloat);

        int myInt = (int)5.0f; //explicit conversion
        System.out.println(myInt);
    }
}

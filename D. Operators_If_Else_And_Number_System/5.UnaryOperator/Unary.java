
public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = -y;
        System.out.println(z);


        int a = 5;
        System.out.println(++a); //pre-increment
        System.out.println(a++); //post-increment
        System.out.println(a);

        int b = 5;
        System.out.println(--b); //pre-decrement
        System.out.println(b--); //post-decrement
        System.out.println(b);
    }

}

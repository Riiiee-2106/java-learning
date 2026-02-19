
public class EscapeSequences10 {
    public static void main(String[] args) {
        System.out.println("hello 'richa'");

       // System.out.println("hello"richa""); -->error
       System.out.println("hello \"richa\""); //-->correct syntax

       //System.out.println("hi\am\i");  -->Error
       System.out.println("hi\\am\\richa\\"); //correct syntax

       System.out.println("hello\nworld");
       System.out.println("hello\tworld");
       System.out.println("hello\bworld");
    }
}

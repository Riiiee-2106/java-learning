public class IfElse {
    public static void main(String[] args) {
         boolean isMale = true;
         String name = "Bob";

         System.out.println("before if");
         if (isMale) {
             System.out.println("Mr."+name);
         }
         else{
            System.out.println("Mrs."+name);
         }

         System.out.println("after if");
    }
}

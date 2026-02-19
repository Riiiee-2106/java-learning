public class BreakContinue {
    

    public static void main(String[] args) {

        //continue
        System.out.println("before loop");
        for(int i=1;i<1000;i++){
            if(i== 101||i== 201||i== 301||i== 401||i== 501||i== 601||i== 701||i== 801||i== 901){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of the loop");


        {
            //break
             System.out.println("before loop");
        for(int i=1;i<1000;i++){
            if(i== 101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of the loop");
        }
    }
}

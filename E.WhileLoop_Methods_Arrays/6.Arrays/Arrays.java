public class Arrays{

    public static void main(String[] args){
        int[] myArr = new int [5];

        myArr[0] = 98;
        myArr[1] = 99;
        myArr[2] = 100;
        myArr[3] = 101;
        myArr[4] = 102;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
         System.out.println(myArr[4]);


         int index = 0;
         while(index<myArr.length){
            System.out.println(myArr[index]);
            index++;
         }
    }
}
public class TwoDimArray{
    public static void main(String[]args){
        // int [][]arr = {}; ->size 0;
        // int [][]arr1 = {{}}; -> size 1 of outer array,size 0 of inner array ;

        // int[][]arr2 = {{},{}}; -> size 2 of outer array, size 1 of inner array;

        int [][]arr = {{},{}};
        System.out.println(arr[0].length);

         int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr1[0].length);


        int i=0;
        while(i<arr1.length){
            int j=0;
            while(j<arr1[i].length){
                System.out.print(arr1[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
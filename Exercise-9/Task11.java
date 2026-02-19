// Create a program to find the sum of both diagonal elements of a square matrix.

public class Task11 {
    
    public static void main(String[] args) {
        
        System.out.println("welcome to the sum of two diagonal elements\n");
        int[][]arr = ArrayUtility.Input2DArray();
        long sum = sumOfDiagonal(arr);
        System.out.println("sum of all diagonal are: "+sum);
        long sumLeft = sumOfLeftDiagonal(arr);
        System.out.println("sum of left diagonal is: "+sumOfLeftDiagonal(arr));
        long sumRight = sumOfRightDiagonal(arr);
        System.out.println("sum of right diagonal is: "+sumOfRightDiagonal(arr));
    }


    public static long sumOfDiagonal(int[][]arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);

        long sum = leftSum+rightSum;
        if(arr.length%2!=0){
            int ind = arr.length/2;
            sum -=arr[ind][ind];
        }
        return sum;
    }
    


    public static long sumOfLeftDiagonal(int[][]arr){
        long sum =0;
        int i=0;
        while(i<arr.length){
           sum+=arr[i][i];
                i++;
            }
            return sum;
        }

    

    public static long sumOfRightDiagonal(int[][]arr){
        long sum = 0;
        int i=0;
        while(i<arr.length){
            int j = arr.length-1-i;
          sum+=arr[i][j];
          i++;
        }
        return sum;
    }


}

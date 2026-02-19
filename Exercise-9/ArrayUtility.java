import java.util.*;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of elements");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("please enter element no: " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static void display(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("please enter the number of columns");
        int col = sc.nextInt();

        int[][] newSize = new int[rows][col];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < col) {
                System.out.print("please enter element row: " + (i + 1) + ", column number: " + (j + 1) + " -> ");
                newSize[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return newSize;
    }
}

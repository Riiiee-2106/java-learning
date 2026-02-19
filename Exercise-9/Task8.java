// Create a program to merge two sorted arrays into a single sorted array.

public class Task8 {
    public static void main(String[] args) {
        System.out.println("please enter the element of first arr");
        int []arr1 = ArrayUtility.InputArray();
           System.out.println("please enter the element of second arr");
        int []arr2 = ArrayUtility.InputArray();

        int[]newArr = mergeSortedArrays(arr1, arr2);
        ArrayUtility.display(newArr);
    }


    public static int[] mergeSortedArrays(int[]arr1,int[]arr2){
     
        int newArr[] = new int[arr1.length+arr2.length];
      
            int i=0,j=0;
            int k=0;
            while(i<arr1.length && j<arr2.length){
                if(arr1[i]<arr2[j]){
                    newArr[k] = arr1[i];
                    i++;
                    k++;
                }

                else {
                    newArr[k] = arr2[j];
                    j++;
                    k++;

                }
            }
                while(i<arr1.length){
                     newArr[k] = arr1[i];
                    i++;
                    k++;
                }
                 while(j<arr2.length){
                     newArr[k] = arr2[j];
                    j++;
                    k++;
                }
            
        return newArr;
            }
        }
           
        
    
    


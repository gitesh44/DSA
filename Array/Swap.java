package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,3,4,22,55,35};

        swap(arr,0,3);

        System.out.println(Arrays.toString(arr));
        /*  public static void main(String[] args): This is the entry point of the program.
         int[] arr = {1, 3, 4, 22, 55, 35};: This initializes an array arr with six integers.
         swap(arr, 0, 3);: This calls the swap method to swap the elements at indices 0 and 3 in the array arr.
         System.out.println(Arrays.toString(arr));: This prints the array after the swap operation using Arrays.toString to convert the array to a string. */



    }
    static void swap(int[]arr,int index,int index2){
            int temp=arr[index];
            arr[index]=arr[index2];
            arr[index2]=temp;



    };


    }

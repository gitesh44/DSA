package Array;

import java.util.Arrays;

public class ArrayPassingFun {
    public static void main(String[] args) {
        int[] arr={3,6,7,4,5}; //strings are immutable in java.

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] arr){  //to exchange the value at any index
                                    //we use change() function
        arr[0]=43; //at any index we can change.
    }


}

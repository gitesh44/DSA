package Array;

import java.util.*;
/**
 Declaration of array----CODE 1----
 */
public class Input {

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        //array of primitives.
        
        int[] arr=new int[5];
        arr[0]=14;
        arr[1]=23;
        arr[2]=33;
        arr[3]=53;
        arr[4]=64;

        System.out.println(Arrays.toString(arr)); //toString() method is used to format the Array while printing it!!



        //INputs using Loops.


        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

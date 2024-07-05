package Array;

import java.util.*;

public class ReverseArray {
   public static void main(String[] args) { //This is the entry point of the program.
    int[] arr={32,45,32,6,56,44};            //initializes an array arr with the given integers.
    int[] reversedArr = Revers(arr);         //calls the Revers method to reverse the array and stores the result in reversedArr.
    for (int num : reversedArr) {            //The for loop iterates through the reversedArr array and prints each element 
     System.out.print(num + " ");           //followed by a space. */
       
        }                                     
    }
   static int[] Revers(int[] arr){

         int start=0;
         int End=arr.length-1;
         while (start<End) {
             int temp=arr[start];
             arr [start]=arr[End];
             arr[End]=temp;

             start ++;
             End--;
            
         }
        return arr;
       
   }
}

/* 
 * static int[] Revers(int[] arr) defines a static method Revers that takes an integer array arr as a parameter and returns an integer array.
int start = 0; initializes the start index to 0.
int end = arr.length - 1; initializes the end index to the last element of the array.
The while (start < end) loop continues until the start index is less than the end index. This condition ensures that the loop only runs while there are elements to swap.
int temp = arr[start]; stores the value at the start index in a temporary variable temp.
arr[start] = arr[end]; sets the value at the start index to the value at the end index.
arr[end] = temp; sets the value at the end index to the value stored in temp, effectively swapping the elements at start and end.
start++; increments the start index to move towards the middle of the array.
end--; decrements the end index to move towards the middle of the array.
return arr; returns the reversed array.
 */
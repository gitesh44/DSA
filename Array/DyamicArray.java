package Array;

import java.util.ArrayList;

public class DyamicArray {
    public static void main(String[] args) {

         ArrayList<Integer>list=new ArrayList<>(10); 
          // 1> dynamic arrays are a fundamental concept that enhances flexibility 
          //and efficiency in handling collections of elements. 
          //Unlike static arrays, which have a fixed size determined at the time of 
          //their creation, dynamic arrays can grow and shrink as needed during runtime.
 

        //2>  Dynamic arrays can automatically resize themselves when they reach their capacity, 
             //typically by allocating a new array with a larger capacity 
             //and copying the elements from the old array to the new one.

        //3> Dynamic array grow auto matically when we try to insert an elemnts
            //-it allows us to add and remiove more elements.
            //-it allocates the memory at the run time using the heap.
            //-it can change its size during the run time.     
         list.add(0, 12);
         list.add(1, 152);
         list.add(2, 125);
         list.add(3, 112);
         list.add(4, 102);
         list.add(5, 112);


         list.remove(125);//fuction to removw the element from an array. 
         list.set(0, 32);//to change or replace an element.

         System.out.println(list);
         
         
    }
}

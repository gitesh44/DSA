package Array;

public class First {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};


    int[] ros ; //declaration of array.ros is getting defined in that stack.
    ros=new int[5]; /*initialisation: actually here object is being created 
                   in th memory(heap memory) which happens at run time 
                   -It is also called as Dynamic Memory allocation
                   -WHAT IS DYNAMIC MEMORY ALLOCATION??
                    ---> To assign memory at run time.
                   -There is no pointer in java
                   1) OBject is being created in heap in everywhere
                   2) Heap object are not continues say java's
                   3) in java array object are not being continues it depends 
                   on JVM  
                   
                   here,
                   NEW keyword is used to create object
                   
                   
                   */
                    
    //integer array
    int[] arrr=new int[9];         //here this happens at run time 
      System.out.println(arr[0]);


    //String array

     
    String[] arrrr=new String[0];
     System.out.println(arr[0]);
      
        }
    
}

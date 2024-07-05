package Array;

public class r1 {
   public static void main(String[] args) {
       int[] arr = {32, 45, 32, 6, 56, 44};
       int sum=calculateSum(arr);

       System.out.println("The sum of the Elemnts is: "+ sum);
   } 

   public static int calculateSum(int[] arr){
     int sum=0;
     for(int element: arr){
        sum=sum+element;
     }

     return sum;





   }
};
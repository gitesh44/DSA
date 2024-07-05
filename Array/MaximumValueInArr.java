package Array;

public class MaximumValueInArr {
    public static void main(String[] args) {
        int[] arr={23,4,77,865,66,98,5543,2234,654};
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {

        int maxv=arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]>maxv){
                maxv=arr[index]; 
            }
            
        }
        return maxv;
        
    }
}

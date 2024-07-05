package Array;

public class SumOfElements {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 24, 23, 84, 885};

        // Call the method to calculate the sum
        int sum = calculateSum(array);

        // Print the result
        System.out.println("The sum of the elements in the array is: " + sum);
    }

    // Method to calculate the sum of elements in an array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}

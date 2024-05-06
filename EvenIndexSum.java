package Complexity_Analysis_and_Array;

// 1. WAP to print the sum of all the elements present on even indexes in the given array.

public class EvenIndexSum {

    public static void main(String[] args) {
        // Example array
        int[] array = { 1, 3, 5, 7, 9, 11 };

        // Call the method to calculate the sum of elements at even indexes
        int sum = sumOfEvenIndexElements(array);

        // Print the result
        System.out.println("Sum of elements at even indexes: " + sum);
    }

    /**
     * This method returns the sum of elements at even indexes in the given array.
     * 
     * @param array the array to process
     * @return the sum of elements at even indexes
     */
    public static int sumOfEvenIndexElements(int[] array) {
        int sum = 0;

        // Loop through the array
        for (int i = 0; i < array.length; i += 2) { // Increment i by 2 to only hit even indexes
            sum += array[i];
        }

        return sum;
    }
}

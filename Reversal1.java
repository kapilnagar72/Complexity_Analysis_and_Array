package Complexity_Analysis_and_Array;

public class Reversal1 {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 1, 45, 25, 23, 1, 6, 7 };
        int n = array.length;

        // This loop reverses the array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Correct placement of the line
    }
}

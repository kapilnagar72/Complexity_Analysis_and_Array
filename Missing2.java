package Complexity_Analysis_and_Array;

public class Missing2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10,4,13 };
        int highestValue = 13; // Highest value is known to be 13
        int sumExpected = highestValue * (highestValue + 1) / 2;
        int sumActual = 0;
        for (int num : arr) {
            sumActual += num;
        }
        int missingNumber = sumExpected - sumActual;
        System.out.println("Missing number: " + missingNumber);
    }
}

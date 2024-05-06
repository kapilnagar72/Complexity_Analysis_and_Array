package Complexity_Analysis_and_Array;
// 3. WAP to calculate the maximum element in the array {10, 7, -5, 8, 9, 0, -4} using standard library methods for
//calculating the maximum element.
public class MaxiElement {
    public static void main(String[] args) {
        int[] arr = { 10, 7, -5, 8, 9, 0, -4 };
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        System.out.print("Largest in given array is " + max);

    }
}

package Complexity_Analysis_and_Array;

public class Missing1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int n = arr.length;

        int sum_natural_num = ((n + 1) * (n + 2)) / 2;
        int sum = 0;

        for (int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        int missing_ele = 0;
        missing_ele = sum_natural_num - sum;
        System.out.println("sum natural missin num " + missing_ele);
    }
}

package Complexity_Analysis_and_Array;

public class Duplicate1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3,4,5,4,3,5,1 };
        int n = arr.length;

        for(int i=0; i<n ; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if (arr[i] == arr[j]) {
                    
                    System.out.println("duplicate num find "+ arr[i]);
                }
            }
        }
    }
}

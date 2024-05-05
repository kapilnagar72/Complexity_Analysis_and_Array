package Complexity_Analysis_and_Array;

public class Palindrome2 {
    public static void main(String[] args) {
        //int[] array = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
        int[] array = { 1, 2,2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
        int n = array.length;
        int flag = 0;
        for (int i =0 ; i<n ; i++)
        {
            if (array[i] != array[n - i - 1]) 
            {
                flag = 1;
                System.out.println("This is Not palindrome arrays");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("This is palindrome arrays");
        }
    }
}

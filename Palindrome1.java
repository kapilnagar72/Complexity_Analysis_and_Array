package Complexity_Analysis_and_Array;

public class Palindrome1 {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 4, 3, 2 };
        int n = array.length;
        int flag = 0;

        for(int i=0; i<n/2; i++)
        {
            if(array[i] != array[n-i-1])
            {
                flag =2;
                System.out.println("Not a palindrome arrays");
                break;

            }
        }
        if (flag == 0) 
        {
          System.out.println("This is palindrome array");   
        }
    }
}

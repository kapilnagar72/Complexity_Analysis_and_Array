package Complexity_Analysis_and_Array;

import java.util.Arrays;

public class RotationMatrix {

public static void rotatedMatrix(int [][] arr)
{
 //step1 transpose 2D arrays
 int m =arr.length;
 int n = arr[0].length;

 for(int i=0; i<m; i++)
 {
 for(int j=i; j<n; j++)
 {
 int temp=arr[i][j];
 arr[i][j]=arr[j][i];
 arr[j][i]=temp;
 }
 }
}
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        //Function calling
        rotatedMatrix(arr);
        for(var mat : arr)
        {
            System.out.println(Arrays.toString(mat));
        }
    }
}

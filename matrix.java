package Complexity_Analysis_and_Array;

import java.util.Scanner;

// Q3: write a program to print the elements of both the diagonals in a user inputted square matrix in any order.
public class matrix {
    public static void main(String args[]){
    
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;    
       
    System.out.println("enter the  matrix element : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }     
    
    System.out.println("Elements of both the diagonals are as follows : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            if(i + j  == m - 1)System.out.print(arr[i][j] + "  ");
            else if(i == j)System.out.print(arr[i][j] + "  ");
            }    
        }  
    }     
}

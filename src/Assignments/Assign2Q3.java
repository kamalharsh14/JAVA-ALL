package Assignments;

import java.util.*;

class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the order of the matrix[n][n]: ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum = 0;
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n; i ++){
            int c = i+1;
            System.out.println("Enter the elements of the row: "+c);
            for(int j = 0; j < n ; j ++){
                a[i][j] =  in.nextInt();
                if( i+j == n-1 ){
                    sum = sum+a[i][j];
                }
            }
        }
        System.out.println("The matrix is : \n");
        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < n ; j ++){
               System.out.print(" "+a[i][j]+" ");                
            }
            System.out.println();                
        }
        System.out.println("\nSum of right diagonal:"+sum);
        in.close();
    }
}
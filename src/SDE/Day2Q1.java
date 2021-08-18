package SDE;
import java.util.*;
public class Day2Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <  m ; j ++){
                a[i][j] = in.nextInt();
            }
        }
        int col = a[0].length;
        int rows =  a.length;
        Boolean column = true;
        for(int i = 0 ; i < rows; i ++){
            if(a[i][0] == 0){
                column = false;
            }
            for(int j = 1 ; j < col ; j ++){
                if(a[i][j] == 0){
                    a[i][0] = a[0][j] = 0;
                }
            }
        }
        for(int i = rows-1; i>=0; i--){
            for(int j = col-1; j> 0; j--){
                if(a[0][j] == 0 || a[i][0] == 0){
                    a[i][j] = 0;
                }
            }
            if(column == false){
                a[i][0] = 0;
            }
        }
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <  m ; j ++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

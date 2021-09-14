package Codeforces;
import java.util.*;
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i = 1 ; i < 6; i++){
            for(int j = 1 ; j < 6; j++){
                a[i][j] = in.nextInt();
            }
        }
        int row = 0;
        int col = 0;
        for(int i = 1 ; i < 6; i++){
            for(int j = 1 ; j < 6; j++){
                if(a[i][j] == 1){
                    row = Math.abs(3-i);
                    col = Math.abs(3-j);
                }
            }
        }
        System.out.println(row+col);
        in.close();
    }
}

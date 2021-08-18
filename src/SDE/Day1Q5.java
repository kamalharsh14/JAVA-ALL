package SDE;
import java.util.*;
public class Day1Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][2];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < 2; j ++){
                a[i][j] = in.nextInt();
            }
        }
        in.close();
    }
}

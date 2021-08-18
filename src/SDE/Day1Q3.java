package SDE;

import java.util.*;

public class Day1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                if(a[i] > b[j]){
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
                Arrays.sort(b);
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }
        for(int i = 0 ; i < m ; i++){
            System.out.print(""+b[i]+" ");
        }
        in.close();
    }
}

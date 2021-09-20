package Codeforces;
import java.util.*;
public class slaythedragon {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int x[] = new int[m];
        int y[] = new int[m];
        for(int i = 0 ; i < m ; i ++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        in.close();
    }
}

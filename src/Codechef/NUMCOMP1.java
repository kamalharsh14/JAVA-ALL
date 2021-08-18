package Codechef;
import java.util.*;
public class NUMCOMP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i< t ; i ++){
            int n = in.nextInt();
            int a[] = new int[n-2];
            for(int j = 2; j <= n ; j++){
                a[j] = j;
            }
        }
        in.close();
    }
}

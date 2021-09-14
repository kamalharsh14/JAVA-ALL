package Codeforces;
import java.util.*;
public class presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n+1];
        for(int i = 1 ; i <= n ; i ++){
            a[in.nextInt()] = i;
        }
        for(int i = 1 ; i <= n ; i ++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}

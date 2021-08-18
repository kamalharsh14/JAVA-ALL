package FINAL450;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ;  i ++){
            a[i] = in.nextInt();
        }
        // O(nlogn)
        // Arrays.sort(a);
        // System.out.println(a[k-1]);
        in.close();
    }
}
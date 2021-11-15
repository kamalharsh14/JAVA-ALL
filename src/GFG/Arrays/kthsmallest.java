package GFG.Arrays;
import java.util.*;
public class kthsmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int k = in.nextInt();
        for(int i = 0 ; i < k ; i++){
            if(i+1 == k){
                System.out.println(a[i]);
            }
        }
        in.close();
    }
}

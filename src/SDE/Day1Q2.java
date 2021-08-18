package SDE;
import java.util.*;
public class Day1Q2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n ; i ++){
            b[i] = 0;
        }
        for(int i = 0 ; i < n ; i ++){
            b[a[i]] = b[a[i]] + 1 ;
        }
        for(int i = 1 ; i <= n ; i ++){
            if(b[i] == 0){
                System.out.println("Missing Number: "+(i));
            }
            if(b[i] > 1){
                System.out.println("Repeated Number: "+(i));
            }
        }
        in.close();
    }
}
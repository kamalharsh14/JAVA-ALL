package Codechef;
import java.util.*;
public class CTIME {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int l = 0 ; l < t ; l ++){
            int n = in.nextInt();
            int k = in.nextInt();
            int f = in.nextInt();
            int sum = 0;
            int start[] = new int[n];
            int end[] = new int[n];
            for(int i = 0 ; i < n ; i ++){
                start[i] = in.nextInt();
                end[i] = in.nextInt();
                sum = sum + (end[i] - start[i]);
            }
            if((f - sum) >= k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}

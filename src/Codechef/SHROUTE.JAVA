package Codechef;
import java.util.*;
public class SHROUTE{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int N = in.nextInt();
            int M = in.nextInt();
            int A[] = new int[N];
            int B[] = new int[M];
            int s[] = new int[N];
            int p[] = new int[N];
            int k = 1;
            for(int j = 0 ; j < N ; j ++){
                A[j] = in.nextInt();
            }
            for(int j = 0 ; j < M ; j ++){
                B[j] = in.nextInt();
            }
            for(int j = 0 ; j < N ; j ++){
                if(A[j] == 1){
                    s[j] = 0;
                }
                else{
                    s[j] = k++;
                }
            }
            for(int j = 0 ; j < N ; j ++){
                if(A[j] == 2){
                    s[j] = 0;
                }
                if(A[n-1])
                }
            }
        }
        in.close();
    }
}
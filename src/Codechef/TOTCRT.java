package Codechef;
import java.util.*;
public class TOTCRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int N = in.nextInt();
            int PC[] = new int[N];
            int S[] = new int[N];
            int C[] = new int[N];
            for(int j = 0 ; j < N ; j ++){
                PC[j] = in.nextInt();
                S[j] = in.nextInt();
            }
            for(int j = 0 ; j < N ; j ++){
                for(int k = 0 ; k < N ; k ++){
                    if(k != j){
                        if(PC[j] == PC[k]){
                            C[j] = 0;
                        }
                    }
                }
            }
        }
        in.close();
    }
}

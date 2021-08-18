package Codechef;

import java.util.*;

public class CHEFHIEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int S = 0;
            int D = in.nextInt();
            int d = in.nextInt();
            int P = in.nextInt();
            int Q = in.nextInt();
            int N = D/d;
            S = S + d*N*(2*P + (N-1)*Q)/2;
            S = S + (D - N*d)*(P + N*Q);
            System.out.println(S);
        }
        in.close();
    }
}

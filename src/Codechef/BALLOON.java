package Codechef;

import java.util.*;

public class BALLOON {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j = 0; j < t; j++) {
            int N = in.nextInt();
            int counter = 0;
            int A[] = new int[N];
            for(int i = 0 ; i < N ; i ++){
                A[i] = in.nextInt();
            }
            for(int i = N-1 ; i >= 0 ; i--){
                if(A[i] >= 1 && A[i] <= 7){
                    counter = i;
                    break;
                }
            }
            System.out.println(counter+1);
        }
        in.close();
    }
}
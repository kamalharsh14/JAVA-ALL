package Codechef;

import java.util.*;

public class CHESUB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j = 0; j < t; j++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int sum = 0;
            int max = a[0];
            for (int i = 0; i < k; i++) {
                sum = sum + (a[i] * i);
                if (max < sum) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            System.out.println(max);
            in.close();
        }
    }
}
